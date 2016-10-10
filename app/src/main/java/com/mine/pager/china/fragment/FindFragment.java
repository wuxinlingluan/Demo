package com.mine.pager.china.fragment;

import com.mine.pager.china.base.BaseFragment;
import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public class FindFragment extends BaseFragment {

    @Override
    public void initView() {
        //View v = View.inflate(MyApplication.getContext(), R.layout.fragment_three, null);

    }

    @Override
    public void initData() {
        stateLayout.showEmptyState();
    }

    @Override
    public Object getContentView() {
        return R.layout.fragment_one;
    }
}
