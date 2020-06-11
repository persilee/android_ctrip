package net.lishaoy.ft_home.adapter;

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

import com.alibaba.android.arouter.launcher.ARouter;

import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.R2;
import net.lishaoy.ft_home.model.TabSelect;
import net.lishaoy.lib_base.lib_home.service.wrapper.WebViewImpl;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;
import net.lishaoy.lib_webview.WebActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabSelectAdapter extends RecyclerView.Adapter<TabSelectAdapter.MyViewHolder> {

    private Context mContext;
    private List<TabSelect.DataBean.ViewspotsBean> mViewspots;
    private List<String> ranks = new ArrayList<>();

    public TabSelectAdapter(Context mContext, List<TabSelect.DataBean.ViewspotsBean> viewspots) {
        this.mContext = mContext;
        this.mViewspots = viewspots;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        for (TabSelect.DataBean.ViewspotsBean viewspotsBean : mViewspots) {
            for (TabSelect.DataBean.ViewspotsBean.TaginfosBean taginfosBean : viewspotsBean.getTaginfos()) {
                if (taginfosBean.getTagtype().equals("rank")) {
                    ranks.add(taginfosBean.getTags().get(0).getSdescription() + taginfosBean.getTags().get(0).getDescs().get(0));
                }
            }
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_select, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ImageLoaderManager.getInstance().displayImageForView(holder.tabSelectImg, mViewspots.get(position).getCimgurl());
        holder.tabSelectTitle.setText(mViewspots.get(position).getName());
        if (mViewspots.get(position).getFeature().isEmpty()) {
            holder.tabSelectDescribe.setVisibility(View.GONE);
        } else {
            holder.tabSelectDescribe.setText(mViewspots.get(position).getFeature());
        }
        if (mViewspots.get(position).getPrice() == 0) {
            holder.tabSelectPriceContainer.setVisibility(View.GONE);
        } else {
            holder.tabSelectPrice.setText(String.valueOf(mViewspots.get(position).getPrice()));
        }
        holder.tabSelectRank.setText(ranks.get(position));
        holder.tabSelectContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://m.ctrip.com/webapp/you/gspoi/sight/0/"+ mViewspots.get(position).getId() +".html?seo=0";
                WebViewImpl.getInstance().gotoWebView(url);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mViewspots.size();
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
