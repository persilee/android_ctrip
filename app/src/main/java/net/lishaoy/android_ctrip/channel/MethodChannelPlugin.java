package net.lishaoy.android_ctrip.channel;

import android.app.Activity;

import net.lishaoy.android_ctrip.events.GotoDestinationSearchPageEvent;
import net.lishaoy.android_ctrip.events.GotoSpeakDestinationPageEvent;
import net.lishaoy.android_ctrip.events.GotoSpeakTravelPageEvent;
import net.lishaoy.android_ctrip.events.GotoTravelSearchPageEvent;
import net.lishaoy.lib_base.lib_webview.service.wrapper.WebViewImpl;

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
            if(methodCall.argument("pageType").equals("destination")){
                EventBus.getDefault().post(new GotoSpeakDestinationPageEvent(methodCall.argument("pageType")));
            }if(methodCall.argument("pageType").equals("travel")){
                EventBus.getDefault().post(new GotoSpeakTravelPageEvent(methodCall.argument("pageType")));
            }
            result.success(200);
        } else if (methodCall.method.equals("gotoWebView")) {
            WebViewImpl.getInstance().gotoWebView(methodCall.argument("url"));
            result.success(200);
        }else if (methodCall.method.equals("gotoTravelSearchPage")){
            EventBus.getDefault().post(new GotoTravelSearchPageEvent());
            result.success(200);
        }
        else {
            result.notImplemented();
        }
    }
}
