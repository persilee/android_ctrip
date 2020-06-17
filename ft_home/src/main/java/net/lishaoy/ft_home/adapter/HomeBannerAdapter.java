package net.lishaoy.ft_home.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.adapter.BannerAdapter;
import net.lishaoy.ft_home.model.Home;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import java.util.List;

public class HomeBannerAdapter extends BannerAdapter<Home.BannerListBean, HomeBannerAdapter.BannerViewHolder> {

    public HomeBannerAdapter(List<Home.BannerListBean> bannerListBeans) {
        super(bannerListBeans);
    }

    @Override
    public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerViewHolder(imageView);
    }

    @Override
    public void onBindView(BannerViewHolder holder, final Home.BannerListBean data, int position, int size) {
        ImageLoaderManager.getInstance().displayImageForView(holder.imageView,data.getSIcon());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebViewImpl.getInstance().gotoWebView(data.getUrl());
            }
        });
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public BannerViewHolder(@NonNull ImageView view) {
            super(view);
            this.imageView = view;
        }
    }
}
