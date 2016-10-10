package com.mine.pager;

import android.widget.TextView;

import com.github.newoschina.R;
import com.mine.pager.fragment.FansFragment;
import com.mine.pager.fragment.mine.fans.FollowFragment;
import com.mine.pager.china.util.UserUtils;

/**
 * Created by Administrator on 2016/10/9.
 */
public class FansActivity extends BaseMineActivity {

    @Override
    protected void initListener() {

    }

    @Override
    protected void initTitle() {
        TextView text_title = (TextView) findViewById(R.id.text_title);
        text_title.setText("关注/粉丝");
    }

    @Override
    protected void initView() {
        fragments.add(new FollowFragment());
        fragments.add(new FansFragment());
    }

    @Override
    protected String[] getTitile() {

        return UserUtils.TITILEFANS;
    }
}
