package com.mine.pager.china.fragment;

import com.mine.pager.china.base.BaseFragment;
import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public class SumFragment extends BaseFragment {

    @Override
    public void initView() {

}

    @Override
    public void initData() {

        stateLayout.showContentState();
    }

    @Override
    public Object getContentView() {
        return R.layout.fragment_one;
    }
}
