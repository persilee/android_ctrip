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
import net.lishaoy.android_ctrip.model.TabSelect;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

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

    }

    @Override
    public int getItemCount() {
        return mViewspots.size();
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
