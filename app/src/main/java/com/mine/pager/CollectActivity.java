package com.mine.pager;

import android.widget.TextView;

import com.github.newoschina.R;
import com.mine.pager.china.util.UserUtils;
import com.mine.pager.fragment.collect.BlogFragment;
import com.mine.pager.fragment.collect.CodeFragment;
import com.mine.pager.fragment.collect.NewsFragment;
import com.mine.pager.fragment.collect.SoftwareFragment;
import com.mine.pager.fragment.collect.TalkFragment;

/**
 * Created by Administrator on 2016/10/9.
 */
public class CollectActivity  extends BaseMineActivity {

    @Override
    protected void initListener() {

    }

    @Override
    protected void initTitle() {
        TextView text_title = (TextView) findViewById(R.id.text_title);
        text_title.setText("用户收藏");
    }

    @Override
    protected void initView() {
        fragments.add(new SoftwareFragment());
        fragments.add(new TalkFragment());
        fragments.add(new CodeFragment());
        fragments.add(new BlogFragment());
        fragments.add(new NewsFragment());
    }

    @Override
    protected String[] getTitile() {
        return UserUtils.TITILECOLLECT;
    }
}
