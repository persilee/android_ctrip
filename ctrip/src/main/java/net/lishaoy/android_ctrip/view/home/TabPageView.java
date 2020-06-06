package net.lishaoy.android_ctrip.view.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.util.ScaleTransitionPagerTitleView;
import net.lishaoy.android_ctrip.view.adapter.TabPageAdepter;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabPageView extends LinearLayout {
    @BindView(R.id.home_tab_view)
    MagicIndicator homeTabView;
    @BindView(R.id.home_page_view)
    ViewPager homePageView;
    private Context mContext;
    private FragmentManager fragmentManager;

    public final static CHANNEL[] titles = new CHANNEL[]{
            CHANNEL.SELECT,
            CHANNEL.NEAR,
            CHANNEL.SCENIC,
            CHANNEL.FOOD
    };
    public final static CHANNEL[] subTitles = new CHANNEL[]{
            CHANNEL.SELECT_SUB,
            CHANNEL.NEAR_SUB,
            CHANNEL.SCENIC_SUB,
            CHANNEL.FOOD_SUB
    };

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
        initViews();
    }

    public TabPageView(Context context) {
        this(context, null);
    }

    public TabPageView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabPageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;

    }

    private void initViews() {
        final View inflate = LayoutInflater.from(mContext).inflate(R.layout.view_tab_page, this);
        ButterKnife.bind(this, inflate);
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public IPagerTitleView getTitleView(Context context, int index) {
                CommonPagerTitleView pagerTitleView = new CommonPagerTitleView(mContext);

                View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_page_title, null);
                TextView title = view.findViewById(R.id.item_tab_title);
                TextView subTitle = view.findViewById(R.id.item_tab_sub_title);
                title.setText(titles[index].getKey());
                subTitle.setText(subTitles[index].getKey());
                pagerTitleView.setContentView(view);

                pagerTitleView.setOnPagerTitleChangeListener(new CommonPagerTitleView.OnPagerTitleChangeListener() {

                    @Override
                    public void onSelected(int index, int totalCount) {
                        title.setTextColor(Color.parseColor("#0196ff"));
                        subTitle.setTextColor(Color.parseColor("#ffffff"));
                        subTitle.setBackgroundResource(R.drawable.tab_title_circular_bg);
                    }

                    @Override
                    public void onDeselected(int index, int totalCount) {
                        title.setTextColor(Color.parseColor("#333333"));
                        subTitle.setTextColor(Color.parseColor("#666666"));
                        subTitle.setBackgroundResource(android.R.color.transparent);
                    }

                    @Override
                    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
                    }

                    @Override
                    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
                    }
                });

                pagerTitleView.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        homePageView.setCurrentItem(index);
                    }
                });


                return pagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                return null;
            }
        });

        homeTabView.setNavigator(commonNavigator);
        homePageView.setAdapter(new TabPageAdepter(fragmentManager, titles));
        ViewPagerHelper.bind(homeTabView, homePageView);
    }
}
