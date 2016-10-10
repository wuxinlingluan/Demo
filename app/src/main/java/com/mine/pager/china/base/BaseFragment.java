package com.mine.pager.china.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mine.pager.china.layout.StateLayout;
import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public abstract class BaseFragment extends Fragment {


    public  StateLayout stateLayout;
    private Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        activity = getActivity();
        stateLayout = (StateLayout) inflater.inflate(R.layout.state_layout, null);
        stateLayout.setContentView(getContentView());
        initView();
        initData();
        return stateLayout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //配合上面的方法使用
        super.onViewCreated(view, savedInstanceState);
    }



    public abstract void initView() ;

    public abstract void initData();
    public abstract Object getContentView();


}
