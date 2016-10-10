package com.mine.pager.china.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/10/8 0008.
 */

public abstract class BaseLayout extends LinearLayout {

    private View view;

    public BaseLayout(Context context) {
        this(context,null);
    }

    public BaseLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BaseLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        view = initView();
        initData();

    }

    public abstract View initView();
    public abstract void initData();


}
