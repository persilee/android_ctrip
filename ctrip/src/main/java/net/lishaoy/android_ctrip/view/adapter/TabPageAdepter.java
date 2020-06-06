package net.lishaoy.android_ctrip.view.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.view.home.tabPages.FoodFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.NearFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.ScenicFragment;
import net.lishaoy.android_ctrip.view.home.tabPages.SelectFragment;

import java.util.List;

public class TabPageAdepter extends FragmentPagerAdapter {

    private CHANNEL[] titles;

    public TabPageAdepter(@NonNull FragmentManager fm,CHANNEL[] titles) {
        super(fm);
        this.titles = titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (titles[position].getValue()){
            case CHANNEL.SELECT_ID:
                return SelectFragment.newInstance();
            case CHANNEL.NEAR_ID:
                return NearFragment.newInstance();
            case CHANNEL.SCENIC_ID:
                return ScenicFragment.newInstance();
            case CHANNEL.FOOD_ID:
                return FoodFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
