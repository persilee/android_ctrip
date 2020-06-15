package net.lishaoy.android_ctrip.view.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.view.destination.DestinationFragment;
import net.lishaoy.android_ctrip.view.my.MyFragment;
import net.lishaoy.android_ctrip.view.travel.TravelFragment;
import net.lishaoy.lib_base.ft_home.service.wrapper.HomeImpl;

import io.flutter.embedding.android.FlutterFragment;

public class NavigatorAdapter extends FragmentPagerAdapter {

    private int size;
    private CHANNEL[] channels;
    private Context context;
    private static FragmentManager mFragmentManager;
    //保存每个Fragment的Tag，刷新页面的依据
    protected static SparseArray<String> tags = new SparseArray<>();

    public NavigatorAdapter(Context context, CHANNEL[] channels, FragmentManager fm, int size) {
        super(fm);
        this.size = size;
        this.channels = channels;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        int type = channels[position].getValue();
        switch (type) {
            case CHANNEL.HOME_ID:
                return HomeImpl.getInstance().toHome(context);
            case CHANNEL.DESTINATION_ID:
                return DestinationFragment.newInstance();
            case CHANNEL.TRAVEL_ID:
                return TravelFragment.newInstance();
            case CHANNEL.MY_ID:
                return MyFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        Fragment fragment = (Fragment) object;
        //如果Item对应的Tag存在，则不进行刷新
        if (tags.indexOfValue(fragment.getTag()) > -1) {
            return super.getItemPosition(object);
        }
        return POSITION_NONE;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //得到缓存的fragment
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        String tag = fragment.getTag();
        //保存每个Fragment的Tag
        tags.put(position, tag);
        return fragment;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
