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
import net.lishaoy.android_ctrip.model.TabScenic;
import net.lishaoy.android_ctrip.util.ScrollViewPager;
import net.lishaoy.android_ctrip.view.adapter.TabScenicAdapter;
import net.lishaoy.android_ctrip.view.adapter.TabSelectAdapter;
import net.lishaoy.android_ctrip.view.home.Events.LoadMoreScenicEvent;
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
public class ScenicFragment extends Fragment {

    @BindView(R.id.tab_scenic_recycler_container)
    RecyclerView tabScenicRecyclerContainer;
    private ScrollViewPager viewPager;
    private Unbinder unbinder;
    private List<TabScenic.DataBean.ProductsBean> products = new ArrayList<>();
    private int i = 0;

    public ScenicFragment(ScrollViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public static ScenicFragment newInstance(ScrollViewPager viewPager) {
        return new ScenicFragment(viewPager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scenic, container, false);
        unbinder = ButterKnife.bind(this, view);
        viewPager.setObjectForPosition(view, 2);
        initViews();
        return view;
    }

    private void initViews() {
        requestDatas();
    }

    private void requestDatas() {
        int pageId = i ++;
        RequestCenter.requestHomeTabScenic(String.valueOf(pageId),"20", new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TabScenic tabScenic = (TabScenic) responseObj;
                products.addAll(tabScenic.getData().getProducts());
                getTabScenicItem();
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        });
    }

    @Subscribe
    public void onLoadMoreScenicData(LoadMoreScenicEvent event){
        requestDatas();
    }

    private void getTabScenicItem() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        tabScenicRecyclerContainer.setLayoutManager(staggeredGridLayoutManager);
        TabScenicAdapter tabSelectAdapter = new TabScenicAdapter(getContext(),products);
        tabScenicRecyclerContainer.setAdapter(tabSelectAdapter);
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
