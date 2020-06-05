package net.lishaoy.android_ctrip.view.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.model.Home;

public class GridNavView extends LinearLayout {
    
    private Context mContext;
    private Home.GridNavBean gridNavBean;

    public void setGridNavBeans(Home.GridNavBean gridNavBean) {
        this.gridNavBean = gridNavBean;
        initViews();
    }

    public GridNavView(Context context) {
        this(context,null);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs) {
        this(context,attrs,0);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    private void initViews() {
        final View inflate = LayoutInflater.from(mContext).inflate(R.layout.view_grid_nav, this);
    }
}
