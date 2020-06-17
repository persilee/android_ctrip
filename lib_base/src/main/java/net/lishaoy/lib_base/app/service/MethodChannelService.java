package net.lishaoy.lib_base.app.service;

import com.alibaba.android.arouter.facade.template.IProvider;

import io.flutter.view.FlutterView;

public interface MethodChannelService extends IProvider {
    void registerWith(FlutterView flutterView);
}
