package net.lishaoy.android_ctrip.view.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.channel.MethodChannelPlugin;
import net.lishaoy.lib_asr.asr.AsrPlugin;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class TravelSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_search);
        getSupportActionBar().hide();
        ImmersionBar.with(this)
                .statusBarDarkFont(true)
                .init();
        FlutterView flutterView = Flutter.createView(this,getLifecycle(),"travel/search");
        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(flutterView,layoutParams);
        MethodChannelPlugin.registerWith(flutterView);
        AsrPlugin.registerWith(flutterView);
    }
}
