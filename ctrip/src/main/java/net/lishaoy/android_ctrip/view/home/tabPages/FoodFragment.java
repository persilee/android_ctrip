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
public class FoodFragment extends Fragment {

    private ScrollViewPager viewPager;

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
        return view;
    }
}
