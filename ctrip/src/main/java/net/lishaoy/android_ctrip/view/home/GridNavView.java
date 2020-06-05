package net.lishaoy.android_ctrip.view.home;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class GridNavView extends LinearLayout {
    
    private Context mContext;
    
    public GridNavView(Context context) {
        this(context,null);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs) {
        this(context,attrs,0);
    }

    public GridNavView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initViews();
    }

    private void initViews() {
    }
}
