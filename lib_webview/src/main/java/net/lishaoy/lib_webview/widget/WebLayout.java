package net.lishaoy.lib_webview.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.just.agentweb.IWebLayout;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

import net.lishaoy.lib_webview.R;
import net.lishaoy.lib_webview.events.RefreshEvent;

import org.greenrobot.eventbus.EventBus;

public class WebLayout implements IWebLayout {

    private Activity activity;
    private WebView webView = null;
    private final SmartRefreshLayout smartRefreshLayout;

    public WebLayout(Activity activity) {
        this.activity = activity;
        smartRefreshLayout = (SmartRefreshLayout) LayoutInflater.from(activity).inflate(R.layout.fragment_twk_web, null);
        smartRefreshLayout.setRefreshHeader(new ClassicsHeader(activity));
        smartRefreshLayout.setEnableLoadMore(false);
        smartRefreshLayout.setEnableNestedScroll(true);
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                EventBus.getDefault().post(new RefreshEvent());
                refreshLayout.finishRefresh(1600);
            }
        });
        webView = smartRefreshLayout.findViewById(R.id.web_view);
    }


    @NonNull
    @Override
    public ViewGroup getLayout() {
        return smartRefreshLayout;
    }

    @Nullable
    @Override
    public WebView getWebView() {
        return webView;
    }
}
