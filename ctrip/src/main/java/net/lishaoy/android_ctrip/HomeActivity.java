package net.lishaoy.android_ctrip;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.android_ctrip.adapter.MyViewPagerAdapter;

import me.majiajie.pagerbottomtabstrip.MaterialMode;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.item.NormalItemView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class HomeActivity extends FragmentActivity {

    private ViewPager viewPager;
    private PageNavigationView pageNavigationView;
    private NavigationController navigationController;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //设置状态栏颜色
        ImmersionBar.with(this)
                .statusBarDarkFont(true)
                .init();

        //初始化导航栏
        pageNavigationView = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);
        navigationController = pageNavigationView.custom()
                .addItem(newItem(R.mipmap.xiecheng,R.mipmap.xiecheng_active,"首页"))
                .addItem(newItem(R.mipmap.mude,R.mipmap.mude_active,"目的地"))
                .addItem(newItem(R.mipmap.lvpai,R.mipmap.lvpai_active,"旅拍"))
                .addItem(newItem(R.mipmap.wode,R.mipmap.wode_active,"我的"))
                .build();

        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(), navigationController.getItemCount()));
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);

        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {

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
}
