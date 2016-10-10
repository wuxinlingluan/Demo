package com.mine.pager.china.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.mine.pager.china.base.BaseLayout;
import com.mine.pager.china.util.MyApplication;
import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/8 0008.
 */

public class MainLayout extends BaseLayout {
    public MainLayout(Context context) {
        this(context,null);
    }

    public MainLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MainLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override

    public View initView() {
        View view = View.inflate(MyApplication.getContext(), R.layout.frame, null);
        FrameLayout viewPager = (FrameLayout) view.findViewById(R.id.fl_contanier);
        RadioGroup viewById = (RadioGroup) view.findViewById(R.id.rg_below);
        return view;

    }

    @Override
    public void initData() {

    }
}
