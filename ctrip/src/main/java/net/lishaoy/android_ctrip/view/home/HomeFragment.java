package net.lishaoy.android_ctrip.view.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.Banner;
import com.youth.banner.util.BannerUtils;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.api.RequestCenter;
import net.lishaoy.android_ctrip.model.Home;
import net.lishaoy.android_ctrip.model.TabSelect;
import net.lishaoy.android_ctrip.util.EllipseIndicator;
import net.lishaoy.android_ctrip.view.adapter.HomeBannerAdapter;
import net.lishaoy.android_ctrip.view.adapter.SubNavViewAdapter;
import net.lishaoy.lib_network.listener.DisposeDataListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";

    @BindView(R.id.home_sub_nav_container)
    RecyclerView homeSubNavContainer;
    @BindView(R.id.home_local_container)
    LocalNavView homeLocalContainer;
    @BindView(R.id.home_grid_nav_container)
    GridNavView homeGridNavContainer;
    @BindView(R.id.home_banner)
    Banner homeBanner;
    @BindView(R.id.home_tab_page_container)
    TabPageView homeTabPageContainer;
    private Unbinder unbinder;
    private Home homeData;
    private FragmentManager fragmentManager;

    public HomeFragment() {
    }

    public static Fragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        initViews();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        fragmentManager = getChildFragmentManager();
    }

    private void initViews() {
        requestHomeDate();
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
                homeTabPageContainer.setFragmentManager(fragmentManager);
                getRecyclerView();
                initBanner();
            }

            @Override
            public void onFailure(Object reasonObj) {
                Log.e(TAG, "onFailure: " + reasonObj);
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
