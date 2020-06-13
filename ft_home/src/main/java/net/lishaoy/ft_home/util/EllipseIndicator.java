package net.lishaoy.ft_home.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;

import com.youth.banner.indicator.BaseIndicator;


public class EllipseIndicator extends BaseIndicator {
    private static final String TAG = "EllipseIndicator";
    private float mNormalRadius;
    private float mSelectedRadius;
    private float maxRadius;

    public EllipseIndicator(Context context) {
        this(context, null);
    }

    public EllipseIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EllipseIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mNormalRadius = config.getNormalWidth() / 2;
        mSelectedRadius = config.getSelectedWidth() / 2;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int count = config.getIndicatorSize();
        if (count <= 1) return;

        mNormalRadius = config.getNormalWidth() / 2;
        mSelectedRadius = config.getSelectedWidth() / 2;
        //考虑当 选中和默认 的大小不一样的情况
        maxRadius = Math.max(mSelectedRadius, mNormalRadius);
        //间距*（总数-1）+最大的半径（考虑有时候选中时会变大的情况）+默认半径*（总数-1）
        int width = (int) (((count - 1) * config.getIndicatorSpace() + 3 * (maxRadius + mNormalRadius * (count - 1))) + maxRadius*3);
        int height = (int) config.getNormalWidth();
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int count = config.getIndicatorSize();
        if (count <= 1) return;
        mPaint.setColor(config.getNormalColor());
        float left = 0;
        for (int i = 0; i < count; i++) {
            float x = maxRadius*2 + (config.getNormalWidth() + config.getIndicatorSpace()) * i;
            canvas.drawCircle(x, mNormalRadius, mNormalRadius, mPaint);
        }
        mPaint.setColor(config.getSelectedColor());
        left = config.getCurrentPosition() == 0 ? 0 : config.getCurrentPosition() * (config.getNormalWidth() + config.getIndicatorSpace());
        RectF rectF = new RectF(left, 0, left + config.getNormalWidth() * 3, config.getNormalWidth());
        canvas.drawRoundRect(rectF, config.getRadius(), config.getRadius(), mPaint);

    }

}
