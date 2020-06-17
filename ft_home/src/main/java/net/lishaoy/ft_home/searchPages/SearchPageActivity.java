package net.lishaoy.ft_home.searchPages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.ft_home.R;
import net.lishaoy.lib_asr.asr.AsrPlugin;
import net.lishaoy.lib_base.app.service.wrapper.MethodChannelImpl;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

@Route(path = "/home/search")
public class SearchPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        ARouter.getInstance().inject(this);

        getSupportActionBar().hide();
        ImmersionBar.with(this)
                .statusBarDarkFont(true)
                .init();
        String params = "{\"routeName\":\"search\",\"placeHolder\":\""+ getIntent().getStringExtra("placeHolder") +"\"}";
        FlutterView flutterView = Flutter.createView(this,getLifecycle(),params);
        LinearLayout.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(flutterView,layoutParams);

        AsrPlugin.registerWith(flutterView);

        MethodChannelImpl.getInstance().registerWith(flutterView);
    }
}
