package net.lishaoy.ft_home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.header.TwoLevelHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.simple.SimpleMultiListener;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.util.BannerUtils;

import net.lishaoy.ft_home.adapter.HomeBannerAdapter;
import net.lishaoy.ft_home.adapter.HomeSearchBarPlaceHolderAdapter;
import net.lishaoy.ft_home.adapter.SubNavViewAdapter;
import net.lishaoy.ft_home.api.RequestCenter;
import net.lishaoy.ft_home.events.IsLoadMoreSelectEvent;
import net.lishaoy.ft_home.events.LoadMoreFoodEvent;
import net.lishaoy.ft_home.events.LoadMoreNearEvent;
import net.lishaoy.ft_home.events.LoadMoreScenicEvent;
import net.lishaoy.ft_home.events.LoadMoreSelectEvent;
import net.lishaoy.ft_home.model.Home;
import net.lishaoy.ft_home.util.CustomScrollView;
import net.lishaoy.ft_home.util.EllipseIndicator;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;
import net.lishaoy.lib_common_ui.utils.Utils;
import net.lishaoy.lib_network.listener.DisposeDataListener;
import net.lucode.hackware.magicindicator.MagicIndicator;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


@Route(path = "/home/home_fragment")
public class HomeFragment extends Fragment implements CustomScrollView.OnHoldTabScrollViewScrollChanged {

    private static final String TAG = "HomeFragment";
    @BindView(R2.id.home_local_container)
    LocalNavView homeLocalContainer;
    @BindView(R2.id.home_grid_nav_container)
    GridNavView homeGridNavContainer;
    @BindView(R2.id.home_sub_nav_container)
    RecyclerView homeSubNavContainer;
    @BindView(R2.id.home_banner)
    Banner homeBanner;
    @BindView(R2.id.home_tab_page_container)
    TabPageView homeTabPageContainer;
    @BindView(R2.id.home_custom_scroll_view)
    CustomScrollView homeCustomScrollView;
    @BindView(R2.id.home_refresh_container)
    SmartRefreshLayout homeRefreshContainer;
    @BindView(R2.id.home_tab_top_view)
    MagicIndicator homeTabTopView;
    @BindView(R2.id.home_search_bar_content)
    EditText homeSearchBarContent;
    @BindView(R2.id.home_search_bar_speak_img)
    ImageView homeSearchBarSpeakImg;
    @BindView(R2.id.home_second_floor_img)
    ImageView homeSecondFloorImg;
    @BindView(R2.id.home_header)
    TwoLevelHeader homeHeader;
    @BindView(R2.id.home_search_bar_container)
    FrameLayout homeSearchBarContainer;
    @BindView(R2.id.home_header_content)
    FrameLayout homeHeaderContent;
    @BindView(R2.id.home_search_bar_placeholder)
    Banner homeSearchBarPlaceholder;

    private Unbinder unbinder;
    private Home homeData;
    private FragmentManager fragmentManager;
    private int tabViewTop;
    private View view;
    private boolean iSLoadSelect;
    Context context;
    private ViewTreeObserver.OnScrollChangedListener mScrollChangedListener;

    public HomeFragment() {
    }

    public HomeFragment(Context context) {
        this.context = context;
    }

    public static Fragment newInstance(Context context) {
        HomeFragment fragment = new HomeFragment(context);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        ARouter.getInstance().inject(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    private void initViews() {
        requestHomeDate();
        mScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {

            @Override
            public void onScrollChanged() {
                tabViewTop = homeTabPageContainer.getTop() + homeSearchBarContainer.getHeight();
            }
        };
        view.getViewTreeObserver().addOnScrollChangedListener(mScrollChangedListener);
    }

    private void initBanner() {
        homeBanner.addBannerLifecycleObserver(this)
                .setAdapter(new HomeBannerAdapter(homeData.getBannerList()))
                .setIndicator(new EllipseIndicator(getContext()))
                .setIndicatorSelectedColorRes(R.color.white)
                .setIndicatorSpace((int) BannerUtils.dp2px(10))
                .setBannerRound(BannerUtils.dp2px(6));


        homeSearchBarPlaceholder
                .setAdapter(new HomeSearchBarPlaceHolderAdapter(homeData.getSearchPlaceHolderList()))
                .setOrientation(Banner.VERTICAL)
                .setDelayTime(3600)
                .setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(Object data, int position) {
                        ARouter.getInstance()
                                .build("/home/search")
                                .withString("placeHolder", ((Home.SearchPlaceHolderListBean) data).getText())
                                .navigation();
                    }
                });
    }

    private void getRecyclerView() {
        List<Home.SubNavListBean> subNavList = homeData.getSubNavList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5);
        homeSubNavContainer.setLayoutManager(gridLayoutManager);
        SubNavViewAdapter subNavViewAdapter = new SubNavViewAdapter(getContext(), subNavList);
        homeSubNavContainer.setAdapter(subNavViewAdapter);
    }

    private void requestHomeDate() {
        RequestCenter.requestHome(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                homeData = (Home) responseObj;
                homeLocalContainer.setNavListBeans(homeData.getLocalNavList());
                homeGridNavContainer.setGridNavBeans(homeData.getGridNav());
                getRecyclerView();
                initBanner();
                initRefreshMore();
                homeTabPageContainer.setFragmentManager(fragmentManager);
                homeCustomScrollView.setOnObservableScrollViewScrollChanged(HomeFragment.this);
            }

            @Override
            public void onFailure(Object reasonObj) {
                Log.e(TAG, "onFailure: " + reasonObj);
            }
        });

    }


    private void initRefreshMore() {
        homeHeader.setRefreshHeader(new ClassicsHeader(getContext()), -1, (int) Utils.dp2px(76));
        homeHeader.setFloorRate(1.6f);
        homeRefreshContainer.setPrimaryColorsId(R.color.colorPrimary, R.color.white);
        homeRefreshContainer.setOnMultiListener(new SimpleMultiListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMore(refreshLayout);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1600);
            }

            @Override
            public void onHeaderMoving(RefreshHeader header, boolean isDragging, float percent, int offset, int headerHeight, int maxDragHeight) {
                homeSecondFloorImg.setVisibility(View.VISIBLE);
                homeSearchBarContainer.setAlpha(1 - Math.min(percent, 1));
            }

            @Override
            public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
                if (oldState == RefreshState.ReleaseToTwoLevel) {
                    homeSecondFloorImg.setVisibility(View.GONE);
                    homeHeaderContent.animate().alpha(1).setDuration(666);
                } else if (newState == RefreshState.PullDownCanceled) {
                    homeHeaderContent.animate().alpha(0).setDuration(666);
                } else if (newState == RefreshState.Refreshing) {
                    homeHeaderContent.animate().alpha(0).setDuration(666);
                } else if (oldState == RefreshState.TwoLevelReleased) {
                    WebViewImpl.getInstance().gotoWebView("https://m.ctrip.com/webapp/you/tsnap/secondFloorIndex.html?isHideNavBar=YES&s_guid=feb780be-c55a-4f92-a6cd-2d81e04d3241", true);
                    homeHeader.finishTwoLevel();
                } else if (oldState == RefreshState.TwoLevel) {
                    homeCustomScrollView.setVisibility(View.GONE);
                    homeHeaderContent.animate().alpha(0).setDuration(666);
                } else if (oldState == RefreshState.TwoLevelFinish) {
                    homeCustomScrollView.setVisibility(View.VISIBLE);
                    homeCustomScrollView.animate().alpha(1).setDuration(666);
                }
            }

        });

    }

    private void loadMore(@NonNull RefreshLayout refreshLayout) {
        int tabIndex = TabPageView.selectTabIndex;
        switch (tabIndex) {
            case 0:
                EventBus.getDefault().post(new LoadMoreSelectEvent());
                if (iSLoadSelect)
                    refreshLayout.finishLoadMore();
                else
                    refreshLayout.finishLoadMore(false);
                break;
            case 1:
                EventBus.getDefault().post(new LoadMoreNearEvent());
                refreshLayout.finishLoadMore();
                break;
            case 2:
                EventBus.getDefault().post(new LoadMoreScenicEvent());
                refreshLayout.finishLoadMore();
            case 3:
                EventBus.getDefault().post(new LoadMoreFoodEvent());
                refreshLayout.finishLoadMore();
            default:
                refreshLayout.finishLoadMore(false);
        }
    }

    @Subscribe
    public void onIsLoadMoreSelect(IsLoadMoreSelectEvent event) {
        iSLoadSelect = event.isLoad();
    }

    @Override
    public void onStart() {
        super.onStart();
        homeBanner.start();
        homeSearchBarPlaceholder.start();
        fragmentManager = getChildFragmentManager();
        EventBus.getDefault().register(this);

    }

    @Override
    public void onStop() {
        super.onStop();
        homeBanner.stop();
        homeSearchBarPlaceholder.stop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        view.getViewTreeObserver().removeOnScrollChangedListener(mScrollChangedListener);
        homeBanner.destroy();
        homeSearchBarPlaceholder.destroy();
    }

    @Override
    public void onObservableScrollViewScrollChanged(int l, int t, int oldl, int oldt) {
        if (t >= tabViewTop) {
            homeTabTopView.setVisibility(View.VISIBLE);
        } else {
            homeTabTopView.setVisibility(View.INVISIBLE);
        }
    }


    @OnClick(R2.id.home_search_bar_content)
    public void onHomeSearchBarContentClicked() {
        ARouter.getInstance()
                .build("/home/search")
                .navigation();
    }

    @OnClick(R2.id.home_search_bar_speak_img)
    public void onHomeSearchBarSpeakImgClicked() {
        ARouter.getInstance()
                .build("/home/speak")
                .withString("pageType", "home")
                .navigation();
    }
}
