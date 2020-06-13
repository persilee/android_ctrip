package net.lishaoy.ft_home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.youth.banner.Banner;
import com.youth.banner.util.BannerUtils;

import net.lishaoy.ft_home.events.IsLoadMoreSelectEvent;
import net.lishaoy.ft_home.events.LoadMoreFoodEvent;
import net.lishaoy.ft_home.events.LoadMoreNearEvent;
import net.lishaoy.ft_home.events.LoadMoreScenicEvent;
import net.lishaoy.ft_home.events.LoadMoreSelectEvent;
import net.lishaoy.ft_home.adapter.HomeBannerAdapter;
import net.lishaoy.ft_home.adapter.SubNavViewAdapter;
import net.lishaoy.ft_home.api.RequestCenter;
import net.lishaoy.ft_home.model.Home;
import net.lishaoy.ft_home.util.CustomScrollView;
import net.lishaoy.ft_home.util.EllipseIndicator;
import net.lishaoy.lib_network.listener.DisposeDataListener;
import net.lucode.hackware.magicindicator.MagicIndicator;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
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

    private Unbinder unbinder;
    private Home homeData;
    private FragmentManager fragmentManager;
    private int tabViewTop;
    private View view;
    private boolean iSLoadSelect;
    Context context;
    private ViewTreeObserver.OnScrollChangedListener mScrollChangedListener;

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
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    @Override
    public void onStart() {
        super.onStart();
        fragmentManager = getChildFragmentManager();
        EventBus.getDefault().register(this);

    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    private void initViews() {
        requestHomeDate();
        mScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {

            @Override
            public void onScrollChanged() {
                tabViewTop = homeTabPageContainer.getTop();
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
                .setBannerRound(BannerUtils.dp2px(6))
                .start();
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
        homeRefreshContainer.setRefreshFooter(new ClassicsFooter(getContext()));
        homeRefreshContainer.setEnableRefresh(false);
        homeRefreshContainer.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                int tabIndex = TabPageView.selectTabIndex;
                switch (tabIndex) {
                    case 0:
                        EventBus.getDefault().post(new LoadMoreSelectEvent());
                        if (iSLoadSelect) {
                            refreshLayout.finishLoadMore();
                        } else {
                            refreshLayout.finishLoadMore(false);
                        }
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
        });

    }

    @Subscribe
    public void onIsLoadMoreSelect(IsLoadMoreSelectEvent event) {
        iSLoadSelect = event.isLoad();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        view.getViewTreeObserver().removeOnScrollChangedListener(mScrollChangedListener);
    }

    @Override
    public void onObservableScrollViewScrollChanged(int l, int t, int oldl, int oldt) {
        if (t >= tabViewTop) {
            homeTabTopView.setVisibility(View.VISIBLE);
        } else {
            homeTabTopView.setVisibility(View.INVISIBLE);
        }
    }
}
