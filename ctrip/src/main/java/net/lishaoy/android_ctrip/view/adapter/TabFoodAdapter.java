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
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

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
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_food, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(restaurants == null) return;
        ImageLoaderManager.getInstance().displayImageForView(holder.tabFoodImg, restaurants.get(position).getImageUrl());
        holder.tabFoodTitle.setText(restaurants.get(position).getName());
        if (restaurants.get(position).getFeature().isEmpty()) {
            holder.tabFoodFeature.setVisibility(View.GONE);
        } else {
            holder.tabFoodFeature.setText(restaurants.get(position).getFeature());
        }
        String price = String.valueOf(restaurants.get(position).getAveragePrice());
        if (!price.isEmpty() && !price.equals("0") && !price.equals("0.0000")) {
            holder.tabFoodPrice.setText(price);
        } else {
            holder.tabFoodPriceContainer.setVisibility(View.GONE);
        }
        if(restaurants.get(position).getShiMeiLinName().isEmpty()){
            holder.tabFoodShiMeiLin.setVisibility(View.GONE);
        }else{
            holder.tabFoodShiMeiLin.setText(restaurants.get(position).getShiMeiLinName());
        }
        if(restaurants.get(position).getCuisineName().isEmpty()){
            holder.tabFoodCuisine.setVisibility(View.GONE);
        }else {
            holder.tabFoodCuisine.setText(restaurants.get(position).getCuisineName());
        }
        if(restaurants.get(position).getTagNameList().size() == 0){
            holder.tabFoodTag.setVisibility(View.GONE);
        }else{
            holder.tabFoodTag.setText(restaurants.get(position).getTagNameList().get(0));
        }
        if(restaurants.get(position).getDistrictCentreDistance().isEmpty()){
            holder.tabDistanceContainer.setVisibility(View.GONE);
        }else{
            holder.tabDistance.setText(restaurants.get(position).getDistrictCentreDistance());
        }

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tab_food_img)
        ImageView tabFoodImg;
        @BindView(R.id.tab_food_title)
        TextView tabFoodTitle;
        @BindView(R.id.tab_food_shi_mei_lin)
        TextView tabFoodShiMeiLin;
        @BindView(R.id.tab_food_cuisine)
        TextView tabFoodCuisine;
        @BindView(R.id.tab_food_tag)
        TextView tabFoodTag;
        @BindView(R.id.tab_food_feature)
        TextView tabFoodFeature;
        @BindView(R.id.tab_food_price)
        TextView tabFoodPrice;
        @BindView(R.id.tab_food_price_container)
        LinearLayout tabFoodPriceContainer;
        @BindView(R.id.tab_distance)
        TextView tabDistance;
        @BindView(R.id.tab_distance_container)
        LinearLayout tabDistanceContainer;
        @BindView(R.id.tab_food_floor_container)
        LinearLayout tabFoodFloorContainer;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
