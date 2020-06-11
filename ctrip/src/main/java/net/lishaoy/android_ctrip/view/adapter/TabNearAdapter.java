package net.lishaoy.android_ctrip.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.TabNearItem;
import net.lishaoy.android_ctrip.model.TabSelect;
import net.lishaoy.lib_common_ui.utils.Utils;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;
import net.lishaoy.lib_image_loader.listener.ImageCallBack;
import net.lishaoy.lib_image_loader.listener.ImageCallBackListener;
import net.lishaoy.lib_webview.WebActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabNearAdapter extends RecyclerView.Adapter<TabNearAdapter.MyViewHolder> {

    private Context mContext;
    private List<String> tabNearItems;
    private List<String> ranks = new ArrayList<>();

    public TabNearAdapter(Context mContext, List<String> tabNearItems) {
        this.mContext = mContext;
        this.tabNearItems = tabNearItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_select, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TabNearItem tabNearItem = new Gson().fromJson(tabNearItems.get(position), TabNearItem.class);
        ImageLoaderManager.getInstance().displayImageForView(holder.tabSelectImg, tabNearItem.getImg().getImg1().getUrl() + "_D_500_500_R5_Q80.jpg");
        holder.tabSelectTitle.setText(tabNearItem.getTitle());
        if (tabNearItem.getItag() != null) {
            holder.tabSelectDescribe.setText(tabNearItem.getItag());
        } else {
            holder.tabSelectDescribe.setVisibility(View.GONE);
        }
        if (tabNearItem.getPrice() == null) {
            holder.tabSelectPriceContainer.setVisibility(View.GONE);
        } else {
            holder.tabSelectPrice.setText(tabNearItem.getPrice());
        }
        if(tabNearItem.getSubtitle1() == null || tabNearItem.getSubtitle1().isEmpty()){
            holder.tabSelectRank.setVisibility(View.GONE);
        }else{
            holder.tabSelectRank.setText(tabNearItem.getSubtitle1());
        }
        if(tabNearItem.getExt().getBiztype().equals("mkt.mkt")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) Utils.dp2px(246));
            holder.tabSelectImg.setLayoutParams(layoutParams);
        }
        float imgWidth = Float.parseFloat(tabNearItem.getImg().getImg1().getWidth());
        float imgHeight = Float.parseFloat(tabNearItem.getImg().getImg1().getHeight());
        if(imgWidth != imgHeight && !tabNearItem.getExt().getBiztype().equals("mkt.mkt")) {
            int targetHeight = (int) ((imgHeight / imgWidth) * 230);
            if(targetHeight <= 166) targetHeight = 166;
            if(targetHeight >= 266) targetHeight = 266;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) Utils.dp2px(targetHeight));
            holder.tabSelectImg.setLayoutParams(layoutParams);
        }
        holder.tabSelectContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WebActivity.class);
                intent.putExtra("url",tabNearItem.getJumpurl());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tabNearItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tab_select_container)
        CardView tabSelectContainer;
        @BindView(R.id.tab_select_img)
        ImageView tabSelectImg;
        @BindView(R.id.tab_select_title)
        TextView tabSelectTitle;
        @BindView(R.id.tab_select_describe)
        TextView tabSelectDescribe;
        @BindView(R.id.tab_select_rank)
        TextView tabSelectRank;
        @BindView(R.id.tab_select_price_container)
        LinearLayout tabSelectPriceContainer;
        @BindView(R.id.tab_select_price)
        TextView tabSelectPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
