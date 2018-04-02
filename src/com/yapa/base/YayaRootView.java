package com.yapa.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class YayaRootView extends FrameLayout {

    public YayaRootView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        YapaToolkit.constraceRoot(this, context, attrs, defStyleAttr);
    }

    public YayaRootView(Context context, AttributeSet attrs) {
        super(context, attrs);
        YapaToolkit.constraceRoot(this, context, attrs);
    }

    public YayaRootView(Context context) {
        super(context);
        YapaToolkit.constraceRoot(this, context);
    }

}
