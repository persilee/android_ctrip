package net.lishaoy.android_ctrip.view.home.tabPages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.util.ScrollViewPager;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearFragment extends Fragment {

    private ScrollViewPager viewPager;

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
        viewPager.setObjectForPosition(view,0);
        return view;
    }
}
