package net.lishaoy.android_ctrip.channel;

import android.app.Activity;
import android.widget.Toast;

import net.lishaoy.android_ctrip.events.GotoDestinationSearchPageEvent;
import net.lishaoy.android_ctrip.events.GotoSpeakPageEvent;
import net.lishaoy.lib_base.lib_home.service.wrapper.WebViewImpl;

import org.greenrobot.eventbus.EventBus;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterView;

public class MethodChannelPlugin implements MethodChannel.MethodCallHandler {

    private static MethodChannel methodChannel;
    private Activity activity;

    private MethodChannelPlugin(Activity activity) {
        this.activity = activity;
    }

    public static void registerWith(FlutterView flutterView) {
        methodChannel = new MethodChannel(flutterView, "MethodChannelPlugin");
        MethodChannelPlugin instance = new MethodChannelPlugin((Activity) flutterView.getContext());
        methodChannel.setMethodCallHandler(instance);
    }

    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("gotoDestinationSearchPage")) {
            EventBus.getDefault().post(new GotoDestinationSearchPageEvent());
            result.success(200);
        } else if (methodCall.method.equals("gotoSpeakPage")) {
            EventBus.getDefault().post(new GotoSpeakPageEvent());
            result.success(200);
        } else if (methodCall.method.equals("gotoWebView")) {
            WebViewImpl.getInstance().gotoWebView(methodCall.argument("url"));
        } else {
            result.notImplemented();
        }
    }
}
