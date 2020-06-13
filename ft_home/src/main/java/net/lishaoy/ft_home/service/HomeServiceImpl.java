package net.lishaoy.ft_home.service;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;

import net.lishaoy.ft_home.HomeFragment;
import net.lishaoy.lib_base.ft_home.service.HomeService;

@Route(path = "/home/home_service")
public class HomeServiceImpl implements HomeService {
    @Override
    public Fragment toHome(Context context) {
       return HomeFragment.newInstance(context);
    }

    @Override
    public void init(Context context) {
        Log.i(HomeServiceImpl.class.getSimpleName(),"init");
    }
}
