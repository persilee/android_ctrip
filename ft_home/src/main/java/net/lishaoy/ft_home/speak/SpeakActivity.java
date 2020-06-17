package net.lishaoy.ft_home.speak;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.ft_home.R;
import net.lishaoy.lib_asr.asr.AsrPlugin;
import net.lishaoy.lib_base.app.service.wrapper.MethodChannelImpl;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

@Route(path = "/home/speak")
public class SpeakActivity extends AppCompatActivity {

    private String sRoute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
        ARouter.getInstance().inject(this);
        getSupportActionBar().hide();
        ImmersionBar.with(this)
                .statusBarDarkFont(true)
                .init();
        sRoute = "speak/" + getIntent().getStringExtra("pageType");
        FlutterView flutterView = Flutter.createView(this,getLifecycle(), sRoute);
        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(flutterView,layoutParams);
        MethodChannelImpl.getInstance().registerWith(flutterView);
        AsrPlugin.registerWith(flutterView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
