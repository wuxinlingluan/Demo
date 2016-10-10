package com.mine.pager.fragment.collect;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.newoschina.R;

/**
 * Created by Administrator on 2016/10/10.
 */
public class SoftwareFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.software_fragment,container,false);

        return view;
    }

}
