package com.mine.pager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.newoschina.R;
import com.viewpagerindicator.TabPageIndicator;

/**
 * Created by Administrator on 2016/10/9.
 */
public class BlogActivity extends BaseMineActivity {

    @Override
    protected void initListener() {

    }

    @Override
    protected void initTitle() {
        TextView text_title = (TextView) findViewById(R.id.text_title);
        text_title.setText("用户博客列表");
    }

    @Override
    protected void initView() {
        TabPageIndicator indicator= (TabPageIndicator) findViewById(R.id.indicator);
        indicator.setVisibility(View.GONE);
    }

    @Override
    protected String[] getTitile() {
        return new String[0];
    }
}
