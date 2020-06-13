package net.lishaoy.ft_home.tabPages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.events.LoadMoreNearEvent;
import net.lishaoy.ft_home.R2;
import net.lishaoy.ft_home.adapter.TabNearAdapter;
import net.lishaoy.ft_home.api.RequestCenter;
import net.lishaoy.ft_home.model.TabNear;
import net.lishaoy.ft_home.util.ScrollViewPager;
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
public class NearFragment extends Fragment {

    @BindView(R2.id.tab_near_recycler_container)
    RecyclerView tabNearRecyclerContainer;
    private ScrollViewPager viewPager;
    private Unbinder unbinder;
    private List<String> tabNearItems = new ArrayList<>();
    private int i = 1;

    public NearFragment(ScrollViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public static NearFragment newInstance(ScrollViewPager viewPager) {
        return new NearFragment(viewPager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_near, container, false);
        unbinder = ButterKnife.bind(this, view);
        viewPager.setObjectForPosition(view, 1);
        initViews();
        return view;
    }

    private void initViews() {
        requestDatas();
    }

    private void getTabNearItem() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        tabNearRecyclerContainer.setLayoutManager(staggeredGridLayoutManager);
        TabNearAdapter tabNearAdapter = new TabNearAdapter(getContext(), tabNearItems);
        tabNearRecyclerContainer.setAdapter(tabNearAdapter);
    }


    private void requestDatas() {
        int pageId = i ++ ;
        RequestCenter.requestHomeTabNear(String.valueOf(pageId),"20",new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TabNear tabNear = (TabNear) responseObj;
                tabNearItems.addAll(tabNear.getData().getItems());
                getTabNearItem();
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        });
    }

    @Subscribe
    public void onLoadMoreNearData(LoadMoreNearEvent event){
        requestDatas();
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
