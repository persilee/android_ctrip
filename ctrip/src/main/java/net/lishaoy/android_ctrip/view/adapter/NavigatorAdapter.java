package net.lishaoy.android_ctrip.view.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lishaoy.android_ctrip.fragment.AFragment;
import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.view.destination.DestinationFragment;
import net.lishaoy.android_ctrip.view.home.HomeFragment;
import net.lishaoy.android_ctrip.view.my.MyFragment;
import net.lishaoy.android_ctrip.view.travel.TravelFragment;

public class NavigatorAdapter extends FragmentPagerAdapter {

    private int size;
    private CHANNEL[] channels;

    public NavigatorAdapter(CHANNEL[] channels, FragmentManager fm, int size) {
        super(fm);
        this.size = size;
        this.channels = channels;
    }

    @Override
    public Fragment getItem(int position) {
        int type = channels[position].getValue();
        switch (type) {
            case CHANNEL.HOME_ID:
                return HomeFragment.newInstance();
            case CHANNEL.DESTINATION_ID:
                return DestinationFragment.newInstance();
            case CHANNEL.TRAVEL_ID:
                return TravelFragment.newInstance();
            case CHANNEL.MY_ID:
                return MyFragment.newInstance();
        }
        return AFragment.newInstance(position + "");
    }

    @Override
    public int getCount() {
        return size;
    }
}
