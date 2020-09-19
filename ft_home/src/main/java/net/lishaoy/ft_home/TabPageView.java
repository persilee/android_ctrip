package net.lishaoy.ft_home;

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

import net.lishaoy.ft_home.adapter.TabPageAdepter;
import net.lishaoy.ft_home.model.CHANNEL;
import net.lishaoy.ft_home.util.CustomScrollView;
import net.lishaoy.ft_home.util.ScrollViewPager;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabPageView extends LinearLayout {
    @BindView(R2.id.home_tab_view)
    MagicIndicator homeTabView;
    @BindView(R2.id.home_page_view)
    ScrollViewPager homePageView;
    private Context mContext;
    private FragmentManager fragmentManager;
    public static int selectTabIndex;

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
    private MagicIndicator homeTabTopView;
    private CustomScrollView homeCustomScrollView;
    private TabPageView homeTabPageContainer;

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
        homeTabTopView = getRootView().findViewById(R.id.home_tab_top_view);
        homeCustomScrollView = getRootView().findViewById(R.id.home_custom_scroll_view);
        homeTabPageContainer = getRootView().findViewById(R.id.home_tab_page_container);
        final View inflate = LayoutInflater.from(mContext).inflate(R.layout.view_tab_page, this);
        ButterKnife.bind(this, inflate);
        initPageView();
        initCustomPagerTitleView();
        initTopPagerTitleView();
        homePageView.setOffscreenPageLimit(4);
    }


    private void initTopPagerTitleView() {
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdjustMode(true);
        commonNavigator.setScrollPivotX(0.25f);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return titles == null ? 0 : titles.length;
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int index) {
                SimplePagerTitleView simplePagerTitleView = new ColorTransitionPagerTitleView(context);
                simplePagerTitleView.setText(titles[index].getKey());
                simplePagerTitleView.setNormalColor(Color.parseColor("#333333"));
                simplePagerTitleView.setSelectedColor(Color.parseColor("#0196ff"));
                simplePagerTitleView.setTextSize(14);
                simplePagerTitleView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                simplePagerTitleView.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        homePageView.setCurrentItem(index);
                    }
                });
                return simplePagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                LinePagerIndicator indicator = new LinePagerIndicator(context);
                indicator.setMode(LinePagerIndicator.MODE_WRAP_CONTENT);
                indicator.setYOffset(UIUtil.dip2px(context, 6));
                indicator.setColors(Color.parseColor("#0196ff"));
                indicator.setRoundRadius(6);
                return indicator;
            }
        });
        homeTabTopView.setNavigator(commonNavigator);
        ViewPagerHelper.bind(homeTabTopView, homePageView);
    }

    private void initPageView() {
        homePageView.setAdapter(new TabPageAdepter(fragmentManager, titles, homePageView));
        homePageView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                homePageView.resetHeight(position);
                selectTabIndex = position;
//                homeCustomScrollView.smoothScrollToShow(0,homeTabPageContainer.getTop() + 2,100);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initCustomPagerTitleView() {
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return titles.length;
            }

            @Override
            public IPagerTitleView getTitleView(Context context, final int index) {
                CommonPagerTitleView pagerTitleView = new CommonPagerTitleView(mContext);

                View view = LayoutInflater.from(mContext).inflate(R.layout.item_tab_page_title, null);
                final TextView title = view.findViewById(R.id.item_tab_title);
                final TextView subTitle = view.findViewById(R.id.item_tab_sub_title);
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
        ViewPagerHelper.bind(homeTabView, homePageView);
    }
}
