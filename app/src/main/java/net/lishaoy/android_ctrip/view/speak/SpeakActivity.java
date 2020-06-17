package net.lishaoy.android_ctrip.view.speak;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.channel.MethodChannelPlugin;
import net.lishaoy.lib_asr.asr.AsrPlugin;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class SpeakActivity extends AppCompatActivity {

    private String sRoute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak);
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
        MethodChannelPlugin.registerWith(flutterView);
        AsrPlugin.registerWith(flutterView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
