package net.lishaoy.lib_base.lib_home.service;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface WebViewService extends IProvider {
    void gotoWebView(String url);
    void gotoWebView(String url,boolean isHideBar);
}
