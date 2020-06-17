package net.lishaoy.ft_home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.R2;
import net.lishaoy.ft_home.model.Home;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubNavViewAdapter extends RecyclerView.Adapter<SubNavViewAdapter.MyViewHolder> {


    private Context context;
    private List<Home.SubNavListBean> subNavListBeanList;

    public SubNavViewAdapter(Context context, List<Home.SubNavListBean> subNavListBeanList) {
        this.context = context;
        this.subNavListBeanList = subNavListBeanList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sub_nav, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ImageLoaderManager.getInstance().displayImageForView(holder.homeSubNavImg, subNavListBeanList.get(position).getIcon());
        holder.homeSubNavTxt.setText(subNavListBeanList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewImpl.getInstance().gotoWebView(subNavListBeanList.get(position).getUrl());
            }
        });
    }

    @Override
    public int getItemCount() {
        return subNavListBeanList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R2.id.home_sub_nav_img)
        ImageView homeSubNavImg;
        @BindView(R2.id.home_sub_nav_txt)
        TextView homeSubNavTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
