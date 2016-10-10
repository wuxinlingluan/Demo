package com.mine.pager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.newoschina.R;
import com.mine.pager.china.util.UserUtils;
import com.mine.pager.fragment.FansFragment;
import com.mine.pager.fragment.mine.fans.FollowFragment;

/**
 * Created by Administrator on 2016/10/9.
 */
public class AttentionActivity extends BaseMineActivity{

    @Override
    protected void initListener() {

    }

    @Override
    protected void initTitle() {
        TextView   text_title = (TextView) findViewById(R.id.text_title);
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
