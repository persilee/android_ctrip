package net.lishaoy.lib_base.lib_webview.service.wrapper;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;

import net.lishaoy.lib_base.lib_webview.service.WebViewService;

public class WebViewImpl {
    @Autowired(name = "/webview/webview_service") protected WebViewService webViewService;

    private static WebViewImpl mWebView = null;

    public static WebViewImpl getInstance(){
        if (mWebView == null){
            synchronized (WebViewImpl.class){
                if (mWebView == null) {
                    mWebView = new WebViewImpl();
                }
            }
        }

        return mWebView;
    }

    private WebViewImpl(){
        ARouter.getInstance().inject(this);
    }

    public void gotoWebView(String url){
        webViewService.gotoWebView(url);
    }

    public void gotoWebView(String url,boolean isHideBar){
        webViewService.gotoWebView(url,isHideBar);
    }
}
