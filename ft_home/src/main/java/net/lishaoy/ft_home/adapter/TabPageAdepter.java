package net.lishaoy.ft_home.adapter;

import android.util.SparseArray;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lishaoy.ft_home.model.CHANNEL;
import net.lishaoy.ft_home.tabPages.FoodFragment;
import net.lishaoy.ft_home.tabPages.NearFragment;
import net.lishaoy.ft_home.tabPages.ScenicFragment;
import net.lishaoy.ft_home.tabPages.SelectFragment;
import net.lishaoy.ft_home.util.ScrollViewPager;

import java.util.List;

public class TabPageAdepter extends FragmentPagerAdapter {

    private CHANNEL[] titles;
    private ScrollViewPager scrollViewPager;
    private static FragmentManager mFragmentManager;
    //保存每个Fragment的Tag，刷新页面的依据
    protected static SparseArray<String> tags = new SparseArray<>();

    public TabPageAdepter(@NonNull FragmentManager fm,CHANNEL[] titles,ScrollViewPager homePageView) {
        super(fm);
        this.titles = titles;
        this.scrollViewPager = homePageView;
        mFragmentManager = fm;
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

    //拿到指定位置的Fragment
    public static Fragment getFragmentByPosition(int position) {
        return mFragmentManager.findFragmentByTag(tags.get(position));
    }

    public List<Fragment> getFragments(){
        return mFragmentManager.getFragments();
    }

    //刷新指定位置的Fragment
    public void notifyFragmentByPosition(int position) {
        tags.removeAt(position);
        notifyDataSetChanged();
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
