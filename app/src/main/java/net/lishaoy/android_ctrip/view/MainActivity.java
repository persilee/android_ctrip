package net.lishaoy.android_ctrip.view;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.CHANNEL;
import net.lishaoy.android_ctrip.util.NoTouchViewPager;
import net.lishaoy.android_ctrip.view.adapter.NavigatorAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.flutter.view.FlutterMain;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.item.NormalItemView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class MainActivity extends FragmentActivity {

    private static final String TAG = "HomeActivity";

    public final static CHANNEL[] CHANNELS = new CHANNEL[]{
            CHANNEL.HOME, CHANNEL.DESTINATION, CHANNEL.TRAVEL, CHANNEL.MY
    };
    @BindView(R.id.viewPager)
    NoTouchViewPager viewPager;
    @BindView(R.id.tab)
    PageNavigationView tab;
    private NavigationController navigationController;
    private Unbinder unbinder;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FlutterMain.startInitialization(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ARouter.init(getApplication());
        unbinder = ButterKnife.bind(this);
        //设置状态栏颜色
        ImmersionBar.with(this)
                .init();
        //初始化导航栏
        navigationController = tab.custom()
                .addItem(newItem(R.mipmap.xiecheng, R.mipmap.xiecheng_active, CHANNEL.HOME.getKey()))
                .addItem(newItem(R.mipmap.mude, R.mipmap.mude_active, CHANNEL.DESTINATION.getKey()))
                .addItem(newItem(R.mipmap.lvpai, R.mipmap.lvpai_active, CHANNEL.TRAVEL.getKey()))
                .addItem(newItem(R.mipmap.wode, R.mipmap.wode_active, CHANNEL.MY.getKey()))
                .build();

        viewPager.setAdapter(new NavigatorAdapter(this,CHANNELS, getSupportFragmentManager(), navigationController.getItemCount()));
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);

        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                if(index == 0 || index == 3) changeStatusBar(false); else changeStatusBar(true);

            }
            @Override
            public void onRepeat(int index) {

            }
        });

    }

    //创建一个Item
    @SuppressLint("ResourceAsColor")
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text) {
        NormalItemView normalItemView = new NormalItemView(this);
        normalItemView.initialize(drawable, checkedDrawable, text);
        normalItemView.setTextDefaultColor(Color.GRAY);
        normalItemView.setTextCheckedColor(0xff4CB7F9);
        return normalItemView;
    }

    private void changeStatusBar(boolean b) {
        ImmersionBar.with(this)
                .statusBarDarkFont(b)
                .init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
