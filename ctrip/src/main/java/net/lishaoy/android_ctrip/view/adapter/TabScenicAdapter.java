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
import net.lishaoy.android_ctrip.model.TabScenic;
import net.lishaoy.android_ctrip.model.TabSelect;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabScenicAdapter extends RecyclerView.Adapter<TabScenicAdapter.MyViewHolder> {

    private Context mContext;
    private List<TabScenic.DataBean.ProductsBean> products;
    private List<String> ranks = new ArrayList<>();
    private List<String> describes = new ArrayList<>();

    public TabScenicAdapter(Context mContext, List<TabScenic.DataBean.ProductsBean> products) {
        this.mContext = mContext;
        this.products = products;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        for (TabScenic.DataBean.ProductsBean products: products) {
            for (TabScenic.DataBean.ProductsBean.TaginfosBean taginfosBean : products.getTaginfos()) {
                if (taginfosBean.getTagType().equals("rank")) ranks.add(taginfosBean.getTagItems().get(0).getTagDesc());

                if(taginfosBean.getTagType().equals("jdrq")) describes.add(taginfosBean.getTagItems().get(0).getTagName());
            }
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_select, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ImageLoaderManager.getInstance().displayImageForView(holder.tabSelectImg, products.get(position).getCimgurl());
        holder.tabSelectTitle.setText(products.get(position).getName());
        if (describes.get(position).isEmpty()) {
            holder.tabSelectDescribe.setVisibility(View.GONE);
        } else {
            holder.tabSelectDescribe.setText(describes.get(position));
        }
        String price = products.get(position).getPrice();
        if (!price.isEmpty() && !price.equals("0") && !price.equals("0.0000")){
            price = products.get(position).getPrice().substring(0,products.get(position).getPrice().indexOf("."));
            holder.tabSelectPrice.setText(price);
        }else {
            holder.tabSelectPriceContainer.setVisibility(View.GONE);
        }
        holder.tabSelectRank.setText(ranks.get(position));

    }

    @Override
    public int getItemCount() {
        return products.size();
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
