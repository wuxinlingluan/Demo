package com.mine.pager.china.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mine.pager.AttentionActivity;
import com.mine.pager.BlogActivity;
import com.mine.pager.CollectActivity;
import com.mine.pager.FansActivity;
import com.mine.pager.GroupActivity;
import com.mine.pager.MesActivity;
import com.mine.pager.NoteActivity;
import com.mine.pager.china.base.BaseFragment;
import com.mine.pager.china.util.MyApplication;
import com.github.newoschina.R;
import com.github.newoschina.view.CircleImageView;
import com.mine.pager.HeadActivity;

/**
 * Created by Administrator on 2016/10/9 0009.
 */

public class MeFragment extends BaseFragment implements View.OnClickListener {

    private View v;
    private ImageView mine_iv_code;
    private CircleImageView mine_iv_head;
    private TextView mine_name;
    private LinearLayout mine_ll_one;
    private LinearLayout mine_ll_two;
    private LinearLayout mine_ll_three;
    private LinearLayout mine_ll_four;
    private TextView mine_tv_score;
    private TextView mine_tv_collect;
    private TextView mine_tv_attention;
    private TextView mine_tv_fans;
    private LinearLayout mine_ll_mes;
    private LinearLayout mine_ll_blog;
    private LinearLayout mine_ll_note;
    private LinearLayout mine_ll_group;

    @Override
    public void initView() {
        //v = View.inflate(MyApplication.getContext(), R.layout.fragment_four, null);
        initFindViewByID();

    }

    private void initFindViewByID() {

        //二维码
        mine_iv_code = (ImageView) stateLayout.findViewById(R.id.mine_iv_code);
        //显示头像
        mine_iv_head = (CircleImageView) stateLayout.findViewById(R.id.mine_iv_head);
        //显示名字
        mine_name = (TextView) stateLayout.findViewById(R.id.mine_name);
        //积分
        mine_ll_one = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_one);
        //收藏
        mine_ll_two = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_two);
        //关注
        mine_ll_three = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_three);
        //粉丝
        mine_ll_four = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_four);
        //积分内容
        mine_tv_score = (TextView) stateLayout.findViewById(R.id.mine_tv_score);
        //收藏内容
        mine_tv_collect = (TextView) stateLayout.findViewById(R.id.mine_tv_collect);
        //关注内容
        mine_tv_attention = (TextView) stateLayout.findViewById(R.id.mine_tv_attention);
        //粉丝内容
        mine_tv_fans = (TextView) stateLayout.findViewById(R.id.mine_tv_fans);
        //消息单个条目
        mine_ll_mes = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_mes);
        //博客单个条目
        mine_ll_blog = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_blog);
        //便签单个条目
        mine_ll_note = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_note);
        //团队单个条目
        mine_ll_group = (LinearLayout) stateLayout.findViewById(R.id.mine_ll_group);
        mine_iv_head.setOnClickListener(this);
        mine_ll_two.setOnClickListener(this);
        mine_ll_three.setOnClickListener(this);
        mine_ll_four.setOnClickListener(this);
        mine_ll_mes.setOnClickListener(this);
        mine_ll_blog.setOnClickListener(this);
        mine_ll_note.setOnClickListener(this);
        mine_ll_group.setOnClickListener(this);



    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mine_iv_code://二维码

                break;
            case R.id.mine_iv_head://点击头像
                startActivity(new Intent(MyApplication.getContext(),HeadActivity.class));

                break;
            case R.id.mine_ll_two://收藏
                startActivity(new Intent(MyApplication.getContext(),CollectActivity.class));

                break;
            case R.id.mine_ll_three://关注
                startActivity(new Intent(MyApplication.getContext(),AttentionActivity.class));
                break;
            case R.id.mine_ll_four://粉丝
                startActivity(new Intent(MyApplication.getContext(),FansActivity.class));
                break;
            case R.id.mine_ll_mes://消息
                startActivity(new Intent(MyApplication.getContext(),MesActivity.class));
                break;
            case R.id.mine_ll_blog://博客
                startActivity(new Intent(MyApplication.getContext(),BlogActivity.class));
                break;
            case R.id.mine_ll_note://便签
                startActivity(new Intent(MyApplication.getContext(),NoteActivity.class));
                break;
            case R.id.mine_ll_group://团队
                startActivity(new Intent(MyApplication.getContext(),GroupActivity.class));
                break;
        }
    }

    @Override
    public void initData() {

        stateLayout.showContentState();
    }

    @Override
    public Object getContentView() {

        return R.layout.fragment_four;
    }
}
