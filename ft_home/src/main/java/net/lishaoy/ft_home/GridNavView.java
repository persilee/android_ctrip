package net.lishaoy.ft_home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import net.lishaoy.ft_home.model.Home;
import net.lishaoy.lib_webview.WebActivity;

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

    @SuppressLint("InvalidR2Usage")
    @OnClick({R2.id.home_grid_nav_hotel, R2.id.home_grid_nav_minsu, R2.id.home_grid_nav_hot, R2.id.home_grid_nav_flight, R2.id.home_grid_nav_train, R2.id.home_grid_nav_bus, R2.id.home_grid_nav_car, R2.id.home_grid_nav_travel, R2.id.home_grid_nav_gaotie, R2.id.home_grid_nav_ship, R2.id.home_grid_nav_custom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R2.id.home_grid_nav_hotel:
                Intent intent1 = new Intent(getContext(), WebActivity.class);
                intent1.putExtra("url",gridNavBean.getHotel().getItem1().getUrl());
                getContext().startActivity(intent1);
                break;
            case R2.id.home_grid_nav_minsu:
                Intent intent2 = new Intent(getContext(), WebActivity.class);
                intent2.putExtra("url",gridNavBean.getHotel().getItem2().getUrl());
                getContext().startActivity(intent2);
                break;
            case R2.id.home_grid_nav_hot:
                Intent intent3 = new Intent(getContext(), WebActivity.class);
                intent3.putExtra("url",gridNavBean.getHotel().getItem3().getUrl());
                getContext().startActivity(intent3);
                break;
            case R2.id.home_grid_nav_flight:
                Intent intent4 = new Intent(getContext(), WebActivity.class);
                intent4.putExtra("url",gridNavBean.getFlight().getItem1().getUrl());
                getContext().startActivity(intent4);
                break;
            case R2.id.home_grid_nav_train:
                Intent intent5 = new Intent(getContext(), WebActivity.class);
                intent5.putExtra("url",gridNavBean.getFlight().getItem2().getUrl());
                getContext().startActivity(intent5);
                break;
            case R2.id.home_grid_nav_bus:
                Intent intent6 = new Intent(getContext(), WebActivity.class);
                intent6.putExtra("url",gridNavBean.getFlight().getItem3().getUrl());
                getContext().startActivity(intent6);
                break;
            case R2.id.home_grid_nav_car:
                Intent intent7 = new Intent(getContext(), WebActivity.class);
                intent7.putExtra("url",gridNavBean.getFlight().getItem4().getUrl());
                getContext().startActivity(intent7);
                break;
            case R2.id.home_grid_nav_travel:
                Intent intent8 = new Intent(getContext(), WebActivity.class);
                intent8.putExtra("url",gridNavBean.getTravel().getItem1().getUrl());
                getContext().startActivity(intent8);
                break;
            case R2.id.home_grid_nav_gaotie:
                Intent intent9 = new Intent(getContext(), WebActivity.class);
                intent9.putExtra("url",gridNavBean.getTravel().getItem2().getUrl());
                getContext().startActivity(intent9);
                break;
            case R2.id.home_grid_nav_ship:
                Intent intent10 = new Intent(getContext(), WebActivity.class);
                intent10.putExtra("url",gridNavBean.getTravel().getItem3().getUrl());
                getContext().startActivity(intent10);
                break;
            case R2.id.home_grid_nav_custom:
                Intent intent11 = new Intent(getContext(), WebActivity.class);
                intent11.putExtra("url",gridNavBean.getTravel().getItem4().getUrl());
                getContext().startActivity(intent11);
                break;
        }
    }
}
