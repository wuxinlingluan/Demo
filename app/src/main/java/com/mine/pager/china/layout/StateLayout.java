package com.mine.pager.china.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public class StateLayout extends FrameLayout {

    private View lodingView;
    private View errorView;
    private View emptyView;
   private  View contentView;

    public StateLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        lodingView = findViewById(R.id.loadingView);
        errorView = findViewById(R.id.error);
        emptyView = findViewById(R.id.emptyView);
        showLoadingState();
    }

    /**
     * 显示正在加载的状态view
     */
    public void showLoadingState() {
        showState(lodingView);
    }



    /**
     * 显示加载失败的View
     */
    public void showFailState() {
        showState(errorView);
    }

    /**
     * 显示加载为空的View
     */
    public void showEmptyState() {
        showState(emptyView);
    }

    /**
     * 显示正常界面的View
     */
    public void showContentState() {
        showState(contentView);
    }


    private void showState(View view) {
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            child.setVisibility(child == view ? View.VISIBLE : View.GONE);
        }

    }

    public void setContentView(Object IdOrView){
        if (IdOrView==null) {
            throw new IllegalArgumentException("参数不能为空");
        }
        if (IdOrView instanceof Integer) {
            int viewID=(Integer)IdOrView;
            contentView=View.inflate(getContext(), viewID, null);
        }else{
            contentView=(View) IdOrView;
        }
        addView(contentView);
        contentView.setVisibility(View.GONE);
    }

}
