package net.lishaoy.ft_home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import net.lishaoy.ft_home.model.Home;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GridNavView extends LinearLayout {

    @BindView(R2.id.home_grid_nav_hotel)
    FrameLayout homeGridNavHotel;
    @BindView(R2.id.home_grid_nav_minsu)
    FrameLayout homeGridNavMinsu;
    @BindView(R2.id.home_grid_nav_hot)
    FrameLayout homeGridNavHot;
    @BindView(R2.id.home_grid_nav_flight)
    FrameLayout homeGridNavFlight;
    @BindView(R2.id.home_grid_nav_train)
    FrameLayout homeGridNavTrain;
    @BindView(R2.id.home_grid_nav_bus)
    FrameLayout homeGridNavBus;
    @BindView(R2.id.home_grid_nav_car)
    FrameLayout homeGridNavCar;
    @BindView(R2.id.home_grid_nav_travel)
    FrameLayout homeGridNavTravel;
    @BindView(R2.id.home_grid_nav_gaotie)
    FrameLayout homeGridNavGaotie;
    @BindView(R2.id.home_grid_nav_ship)
    FrameLayout homeGridNavShip;
    @BindView(R2.id.home_grid_nav_custom)
    FrameLayout homeGridNavCustom;

    private Context mContext;
    private Home.GridNavBean gridNavBean;
    private View inflate;

    public void setGridNavBeans(Home.GridNavBean gridNavBean) {
        this.gridNavBean = gridNavBean;
        initViews();
    }

    public GridNavView(Context context) {
        this(context, null);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    private void initViews() {
        inflate = LayoutInflater.from(mContext).inflate(R.layout.view_grid_nav, this);
        ButterKnife.bind(this, inflate);
    }


    @OnClick(R2.id.home_grid_nav_hotel)
    public void onHomeGridNavHotelClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getHotel().getItem1().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_minsu)
    public void onHomeGridNavMinsuClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getHotel().getItem2().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_hot)
    public void onHomeGridNavHotClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getHotel().getItem3().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_flight)
    public void onHomeGridNavFlightClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getFlight().getItem1().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_train)
    public void onHomeGridNavTrainClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getFlight().getItem2().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_bus)
    public void onHomeGridNavBusClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getFlight().getItem3().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_car)
    public void onHomeGridNavCarClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getFlight().getItem4().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_travel)
    public void onHomeGridNavTravelClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getTravel().getItem1().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_gaotie)
    public void onHomeGridNavGaotieClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getTravel().getItem2().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_ship)
    public void onHomeGridNavShipClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getTravel().getItem3().getUrl());
    }

    @OnClick(R2.id.home_grid_nav_custom)
    public void onHomeGridNavCustomClicked() {
        WebViewImpl.getInstance().gotoWebView(gridNavBean.getTravel().getItem4().getUrl());
    }
}
