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

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.TabFood;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;
import net.lishaoy.lib_webview.WebActivity;

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
        holder.tabFoodContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://m.ctrip.com/webapp/you/foods/26/"+ restaurants.get(position).getRestaurantId() +".html?ishideheader=true&navBarStyle=white&from=https%3A%2F%2Fm.ctrip.com%2Fwebapp%2Fgourmet%2Ffood%2FhomeList%2Faddress.html%3Fnew%3D1%26isHideNavBar%3DYES%26ishideheader%3Dtrue%26seo%3D0%26secondwakeup%3Dtrue%26dpclickjump%3Dtrue%26allianceid%3D66672%26sid%3D508670%26from%3Dhttp%253A%252F%252Fm.ctrip.com%252Fhtml5%252F";
                Intent intent = new Intent(v.getContext(), WebActivity.class);
                intent.putExtra("url",url);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tab_food_container)
        CardView tabFoodContainer;
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
