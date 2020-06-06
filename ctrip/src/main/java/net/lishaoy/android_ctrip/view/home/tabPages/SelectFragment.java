package net.lishaoy.android_ctrip.view.home.tabPages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lishaoy.android_ctrip.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectFragment extends Fragment {

    public SelectFragment() {
    }

    public static SelectFragment newInstance() {
        return new SelectFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initViews();
        return inflater.inflate(R.layout.fragment_select, container, false);
    }

    private void initViews() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

    }


}
