package net.lishaoy.android_ctrip.view.home.tabPages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.api.RequestCenter;
import net.lishaoy.android_ctrip.model.TabNear;
import net.lishaoy.android_ctrip.util.ScrollViewPager;
import net.lishaoy.android_ctrip.view.adapter.TabNearAdapter;
import net.lishaoy.lib_network.listener.DisposeDataListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearFragment extends Fragment {

    @BindView(R.id.tab_near_recycler_container)
    RecyclerView tabNearRecyclerContainer;
    private ScrollViewPager viewPager;
    private Unbinder unbinder;
    private List<String> tabNearItems;

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
        RequestCenter.requestHomeTabNear(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TabNear tabNear = (TabNear) responseObj;
                tabNearItems = tabNear.getData().getItems();
                getTabNearItem();
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
