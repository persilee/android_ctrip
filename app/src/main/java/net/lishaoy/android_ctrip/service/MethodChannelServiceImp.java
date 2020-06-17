package net.lishaoy.android_ctrip.service;


import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

import net.lishaoy.android_ctrip.channel.MethodChannelPlugin;
import net.lishaoy.lib_base.app.service.MethodChannelService;

import io.flutter.view.FlutterView;

@Route(path = "/app/MethodChannel")
public class MethodChannelServiceImp implements MethodChannelService {
    @Override
    public void registerWith(FlutterView flutterView) {
        MethodChannelPlugin.registerWith(flutterView);
    }

    @Override
    public void init(Context context) {
        Log.i(MethodChannelServiceImp.class.getSimpleName(),"init");
    }
}
