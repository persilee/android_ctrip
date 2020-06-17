package net.lishaoy.lib_base.app.service.wrapper;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;

import net.lishaoy.lib_base.app.service.MethodChannelService;

import io.flutter.view.FlutterView;

public class MethodChannelImpl {
    @Autowired(name = "/app/MethodChannel")
    protected MethodChannelService methodChannelService;

    private static MethodChannelImpl methodChannel = null;

    public static MethodChannelImpl getInstance() {
        if (methodChannel == null) {
            synchronized (MethodChannelImpl.class) {
                if (methodChannel == null) {
                    methodChannel = new MethodChannelImpl();
                }
            }
        }

        return methodChannel;
    }

    private MethodChannelImpl() {
        ARouter.getInstance().inject(this);
    }

    public void registerWith(FlutterView flutterView) {
        methodChannelService.registerWith(flutterView);
    }
}
