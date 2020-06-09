package net.lishaoy.android_ctrip.view.home.tabPages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.api.RequestCenter;
import net.lishaoy.android_ctrip.model.TabFood;
import net.lishaoy.android_ctrip.util.ScrollViewPager;
import net.lishaoy.android_ctrip.view.adapter.TabFoodAdapter;
import net.lishaoy.android_ctrip.view.home.Events.LoadMoreFoodEvent;
import net.lishaoy.lib_network.listener.DisposeDataListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    @BindView(R.id.tab_food_recycler_container)
    RecyclerView tabFoodRecyclerContainer;
    private ScrollViewPager viewPager;
    private Unbinder unbinder;
    private List<TabFood.RestaurantsBean> restaurants = new ArrayList<>();
    private int i = 0;

    public FoodFragment(ScrollViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public static FoodFragment newInstance(ScrollViewPager viewPager) {
        return new FoodFragment(viewPager);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        unbinder = ButterKnife.bind(this, view);
        initViews();
        viewPager.setObjectForPosition(view, 3);
        return view;
    }

    private void initViews() {
        requestDatas();
    }

    private void requestDatas() {
        int pageId = i ++;
        RequestCenter.requestHomeTabFood(String.valueOf(pageId), "20", new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TabFood tabFood = (TabFood) responseObj;
                restaurants.addAll(tabFood.getRestaurants());
                getTabFoodItem();
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        });
    }

    @Subscribe
    public void onLoadMoreFoodData(LoadMoreFoodEvent event){
        requestDatas();
    }

    private void getTabFoodItem() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        tabFoodRecyclerContainer.setLayoutManager(staggeredGridLayoutManager);
        TabFoodAdapter tabFoodAdapter = new TabFoodAdapter(getContext(),restaurants);
        tabFoodRecyclerContainer.setAdapter(tabFoodAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
