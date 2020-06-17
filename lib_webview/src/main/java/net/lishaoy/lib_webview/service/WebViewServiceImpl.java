package net.lishaoy.lib_webview.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import net.lishaoy.lib_base.lib_webview.service.WebViewService;

@Route(path = "/webview/webview_service")
public class WebViewServiceImpl implements WebViewService {

    @Override
    public void gotoWebView(String url) {
        ARouter.getInstance()
                .build("/webview/web_activity")
                .withString("url", url)
                .navigation();
    }

    public void gotoWebView(String url,boolean isHideBar){
        ARouter.getInstance()
                .build("/webview/web_activity")
                .withString("url", url)
                .withBoolean("isHideBar", isHideBar)
                .navigation();
    }

    @Override
    public void init(Context context) {
        Log.i(WebViewServiceImpl.class.getSimpleName(),"init");
    }
}
