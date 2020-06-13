package net.lishaoy.ft_home.tabPages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import net.lishaoy.ft_home.events.IsLoadMoreSelectEvent;
import net.lishaoy.ft_home.events.LoadMoreSelectEvent;
import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.R2;
import net.lishaoy.ft_home.adapter.TabSelectAdapter;
import net.lishaoy.ft_home.api.RequestCenter;
import net.lishaoy.ft_home.model.TabSelect;
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
public class SelectFragment extends Fragment {

    @BindView(R2.id.tab_select_recycler_container)
    RecyclerView tabSelectRecyclerContainer;
    private Unbinder unbinder;
    private List<TabSelect.DataBean.ViewspotsBean> viewspots = new ArrayList<>();
    private ScrollViewPager viewPager;
    private View view;
    private int i = 0;

    public SelectFragment(ScrollViewPager scrollViewPager) {
        this.viewPager = scrollViewPager;
    }

    public static SelectFragment newInstance(ScrollViewPager viewPager) {
        return new SelectFragment(viewPager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_select, container, false);
        unbinder = ButterKnife.bind(this, view);
        viewPager.setObjectForPosition(view, 0);
        initViews();
        return view;
    }

    private void initViews() {
        requestDatas();
    }

    private void getTabSeletItem() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        tabSelectRecyclerContainer.setLayoutManager(staggeredGridLayoutManager);
        TabSelectAdapter tabSelectAdapter = new TabSelectAdapter(getContext(), viewspots);
        tabSelectRecyclerContainer.setAdapter(tabSelectAdapter);
    }

    private void requestDatas() {
        int pageId = i ++;
        RequestCenter.requestHomeTabSelect(String.valueOf(pageId), "20", new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TabSelect tabSelect = (TabSelect) responseObj;
                viewspots.addAll(tabSelect.getData().getViewspots());
                getTabSeletItem();
                EventBus.getDefault().post(new IsLoadMoreSelectEvent(true));
            }

            @Override
            public void onFailure(Object reasonObj) {
                EventBus.getDefault().post(new IsLoadMoreSelectEvent(false));
            }
        });
    }

    @Subscribe
    public void onLoadMoreSelectData(LoadMoreSelectEvent event) {
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
