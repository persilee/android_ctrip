package net.lishaoy.ft_home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import net.lishaoy.ft_home.model.Home;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocalNavView extends LinearLayout {

    private static final String TAG = "LocalNavView";

    @BindView(R2.id.nav_img_attractions)
    ImageView navImgAttractions;
    @BindView(R2.id.nav_txt_attractions)
    TextView navTxtAttractions;
    @BindView(R2.id.nav_img_tickets)
    ImageView navImgTickets;
    @BindView(R2.id.nav_txt_tickets)
    TextView navTxtTickets;
    @BindView(R2.id.nav_img_food)
    ImageView navImgFood;
    @BindView(R2.id.nav_txt_food)
    TextView navTxtFood;
    @BindView(R2.id.nav_img_around)
    ImageView navImgAround;
    @BindView(R2.id.nav_txt_around)
    TextView navTxtAround;
    @BindView(R2.id.nav_img_day)
    ImageView navImgDay;
    @BindView(R2.id.nav_txt_day)
    TextView navTxtDay;
    private Context mContext;
    private List<Home.LocalNavListBean> navListBeans;

    public void setNavListBeans(List<Home.LocalNavListBean> navListBeans) {
        this.navListBeans = navListBeans;
        initView();
    }

    public LocalNavView(Context context) {
        this(context, null);
    }

    public LocalNavView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LocalNavView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }


    private void initView() {
        final View inflate = LayoutInflater.from(mContext).inflate(R.layout.view_local_nav, this);
        ButterKnife.bind(this, inflate);
        updateView();
    }


    private void updateView() {
        List<ImageView> imageViews = new ArrayList<>();
        List<TextView> textViews = new ArrayList<>();
        Collections.addAll(imageViews, navImgAttractions, navImgTickets, navImgFood, navImgAround, navImgDay);
        Collections.addAll(textViews, navTxtAttractions, navTxtTickets, navTxtFood, navTxtAround, navTxtDay);
        for (int i = 0; i < navListBeans.size(); i++) {
            ImageLoaderManager.getInstance().displayImageForView(imageViews.get(i), navListBeans.get(i).getIcon());
            textViews.get(i).setText(navListBeans.get(i).getTitle());
            imageViews.get(i).setOnClickListener(navOnclick());
            imageViews.get(i).setTag(i);
        }
    }

    @NotNull
    private OnClickListener navOnclick() {
        return new OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                WebViewImpl.getInstance().gotoWebView(navListBeans.get(position).getUrl());
            }
        };
    }

}
