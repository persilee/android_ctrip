package net.lishaoy.android_ctrip.view.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.util.ScrollViewPager;
import net.lishaoy.android_ctrip.view.home.tabPages.FoodFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.NearFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.ScenicFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.SelectFragment;

import java.util.List;

public class TabPageAdepter extends FragmentPagerAdapter {

    private CHANNEL[] titles;
    private ScrollViewPager scrollViewPager;

    public TabPageAdepter(@NonNull FragmentManager fm,CHANNEL[] titles,ScrollViewPager homePageView) {
        super(fm);
        this.titles = titles;
        this.scrollViewPager = homePageView;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (titles[position].getValue()){
            case CHANNEL.SELECT_ID:
                return SelectFragment.newInstance(scrollViewPager);
            case CHANNEL.NEAR_ID:
                return NearFragment.newInstance(scrollViewPager);
            case CHANNEL.SCENIC_ID:
                return ScenicFragment.newInstance(scrollViewPager);
            case CHANNEL.FOOD_ID:
                return FoodFragment.newInstance(scrollViewPager);
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
