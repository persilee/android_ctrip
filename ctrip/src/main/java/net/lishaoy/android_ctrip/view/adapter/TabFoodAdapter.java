package net.lishaoy.android_ctrip.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.TabFood;
import net.lishaoy.android_ctrip.model.TabScenic;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabFoodAdapter extends RecyclerView.Adapter<TabFoodAdapter.MyViewHolder> {

    private Context mContext;
    private List<TabFood.RestaurantsBean> restaurants;

    public TabFoodAdapter(Context mContext, List<TabFood.RestaurantsBean> restaurants) {
        this.mContext = mContext;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_select, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ImageLoaderManager.getInstance().displayImageForView(holder.tabSelectImg, restaurants.get(position).getImageUrl());
        holder.tabSelectTitle.setText(restaurants.get(position).getName());
        if (restaurants.get(position).getFeature().isEmpty()) {
            holder.tabSelectDescribe.setVisibility(View.GONE);
        } else {
            holder.tabSelectDescribe.setText(restaurants.get(position).getFeature());
        }
        String price = String.valueOf(restaurants.get(position).getAveragePrice());
        if (!price.isEmpty() && !price.equals("0") && !price.equals("0.0000")){
            holder.tabSelectPrice.setText(price);
        }else {
            holder.tabSelectPriceContainer.setVisibility(View.GONE);
        }
        holder.tabSelectRank.setText(restaurants.get(position).getSmallRankingNo());

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
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
