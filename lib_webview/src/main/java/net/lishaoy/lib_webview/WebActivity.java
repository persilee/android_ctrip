package net.lishaoy.lib_webview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.DefaultWebClient;
import com.just.agentweb.WebChromeClient;
import com.just.agentweb.WebViewClient;

import net.lishaoy.lib_webview.events.RefreshEvent;
import net.lishaoy.lib_webview.widget.WebLayout;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

@Route(path = "/webview/web_activity")
public class WebActivity extends AppCompatActivity {

    private AgentWeb agentWeb;
    private LinearLayout linearLayout;
    private ActionBar actionBar;
    public static final String KEY_URL = "url";
    @Autowired(name = KEY_URL)
    protected String mUrl;

    public WebActivity(){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ARouter.getInstance().inject(this);
        setTitle("");
        initViews();
    }

    private void initViews() {
        linearLayout = findViewById(R.id.web_container);
        if(this.getIntent().getBooleanExtra("isHideBar",false)){
            initActionBar();
        }else{
            initHideBar();
        }
        initWeb();
    }

    private void initHideBar() {
        getSupportActionBar().hide();
        ImmersionBar.with(this)
                .statusBarColor("#ffffff")
                .statusBarDarkFont(true)
                .init();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMargins(0, ImmersionBar.getStatusBarHeight(this),0,0);
        linearLayout.setLayoutParams(layoutParams);
    }

    private void initActionBar() {
        ImmersionBar.with(this)
                .statusBarColor("#4CB7F9")
                .init();
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMargins(0, ImmersionBar.getActionBarHeight(this) + ImmersionBar.getStatusBarHeight(this),0,0);
        linearLayout.setLayoutParams(layoutParams);
    }

    private void initWeb() {
        agentWeb = AgentWeb.with(this)
                .setAgentWebParent(linearLayout, new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .setWebChromeClient(webChromeClient)
                .setWebViewClient(webViewClient)
                .setMainFrameErrorView(R.layout.agentweb_error_page, -1)
                .setSecurityType(AgentWeb.SecurityType.STRICT_CHECK)
                .setWebLayout(new WebLayout(this))
                .setOpenOtherPageWays(DefaultWebClient.OpenOtherPageWays.ASK)
                .interceptUnkownUrl()
                .createAgentWeb()
                .ready()
                .go(mUrl);
    }

    private WebChromeClient webChromeClient = new WebChromeClient() {
        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (actionBar != null) {
                actionBar.setTitle(title);
            }
        }
    };

    private WebViewClient webViewClient = new WebViewClient() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Log.i("shouldOver", "@@@ "+request.getUrl().toString());
            if (request.getUrl().toString().contains("m.ctrip.com/html5")) {
                WebActivity.this.finish();
                return false;
            }
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }
    };

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (agentWeb.handleKeyEvent(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        agentWeb.getWebLifeCycle().onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        agentWeb.getWebLifeCycle().onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if(!agentWeb.back()){
                    this.finish();
                    return true;
                }
        }
        return super.onOptionsItemSelected(item);
    }

    @Subscribe
    public void refreshWebView (RefreshEvent event){
        agentWeb.getUrlLoader().reload();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
