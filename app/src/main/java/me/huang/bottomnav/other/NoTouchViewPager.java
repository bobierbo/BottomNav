package me.huang.bottomnav.other;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 使ViewPager不能滑动
 */
public class NoTouchViewPager extends ViewPager{

    private boolean touchEnable = false;
    
    public NoTouchViewPager(Context context) {
        super(context);
    }

    public NoTouchViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return touchEnable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return touchEnable;
    }

    public boolean isTouchEnable() {
        return touchEnable;
    }

    public void setTouchEnable(boolean touchEnable) {
        this.touchEnable = touchEnable;
    }
}
