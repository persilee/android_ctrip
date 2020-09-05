package net.lishaoy.ft_home.adapter;

import android.content.Context;
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
import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.R2;
import net.lishaoy.ft_home.model.TabNearItem;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;
import net.lishaoy.lib_common_ui.utils.Utils;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

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
        String url = "";
        float imgWidth = 0.0f;
        float imgHeight = 0.0f;
        final TabNearItem tabNearItem = new Gson().fromJson(tabNearItems.get(position), TabNearItem.class);
        if(tabNearItem.getImg().getImg1() != null) {
            url = tabNearItem.getImg().getImg1().getUrl().substring(0,tabNearItem.getImg().getImg1().getUrl().lastIndexOf("."));
        }
        ImageLoaderManager.getInstance().displayImageForView(holder.tabSelectImg, url + "_D_500_500_R5_Q80.jpg");
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
        if(tabNearItem.getImg().getImg1() != null) {
            imgWidth = Float.parseFloat(tabNearItem.getImg().getImg1().getWidth());
            imgHeight = Float.parseFloat(tabNearItem.getImg().getImg1().getHeight());
        }
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
                WebViewImpl.getInstance().gotoWebView(tabNearItem.getJumpurl());
            }
        });

    }

    @Override
    public int getItemCount() {
        return tabNearItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R2.id.tab_select_container)
        CardView tabSelectContainer;
        @BindView(R2.id.tab_select_img)
        ImageView tabSelectImg;
        @BindView(R2.id.tab_select_title)
        TextView tabSelectTitle;
        @BindView(R2.id.tab_select_describe)
        TextView tabSelectDescribe;
        @BindView(R2.id.tab_select_rank)
        TextView tabSelectRank;
        @BindView(R2.id.tab_select_price_container)
        LinearLayout tabSelectPriceContainer;
        @BindView(R2.id.tab_select_price)
        TextView tabSelectPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
