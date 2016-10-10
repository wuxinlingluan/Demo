package com.mine.pager;

import android.widget.TextView;

import com.github.newoschina.R;
import com.mine.pager.china.util.UserUtils;
import com.mine.pager.fragment.CommnetFragment;
import com.mine.pager.fragment.FansFragment;
import com.mine.pager.fragment.LeaveFragment;
import com.mine.pager.fragment.MineFragment;
import com.mine.pager.fragment.TabFragment;

/**
 * Created by Administrator on 2016/10/9.
 */
public class MesActivity extends BaseMineActivity {


    @Override
    protected void initListener() {

    }

    @Override
    protected void initTitle() {
        TextView text_title = (TextView) findViewById(R.id.text_title);
        text_title.setText("消息中心");
    }

    public void initView() {

        fragments.add(new MineFragment());
        fragments.add(new CommnetFragment());
        fragments.add(new LeaveFragment());
        fragments.add(new FansFragment());
        fragments.add(new TabFragment());
    }

    @Override
    protected String[] getTitile() {
        return UserUtils.TITILEMES;
    }


}
