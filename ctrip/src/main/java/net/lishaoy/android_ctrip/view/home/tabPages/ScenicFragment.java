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
public class ScenicFragment extends Fragment {

    private ScrollViewPager viewPager;

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
        viewPager.setObjectForPosition(view, 0);
        return view;
    }
}
