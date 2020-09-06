package com.example.mymusicandroid.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.mymusicandroid.MainActivity;
import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;
import com.example.mymusicandroid.adapter.GuideAdapter;
import com.example.mymusicandroid.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.List;

import androidx.viewpager.widget.ViewPager;
import me.relex.circleindicator.CircleIndicator;

/**
 * @author MW
 * @date 2020/8/16
 * <p>
 * 描述：引导页面
 */

public class GuideActivity extends BaseCommonActivity implements View.OnClickListener {

    private static final String TAG = " GuideActivity";
    private Button bt_login_or_register;
    private Button bt_enter;
    private FrameLayout mFlContent;
    private ViewPager mViewPager;
    private GuideAdapter mAdapter;
    private CircleIndicator mIndicator;//指示器

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

    }


    @Override
    protected void initDatum() {
        //1.创建适配器
        mAdapter = new GuideAdapter(GuideActivity.this,getSupportFragmentManager());

        //2.设置适配器
        mViewPager.setAdapter(mAdapter);

        //指示器与ViewPager配合
        mIndicator.setViewPager(mViewPager);
        //适配器注册数据源观察者
        mAdapter.registerDataSetObserver(mIndicator.getDataSetObserver());

        //声明数据源
        List<Integer> dataList = new ArrayList<>();
        dataList.add(R.drawable.guide1);
        dataList.add(R.drawable.guide2);
        dataList.add(R.drawable.guide3);
        dataList.add(R.drawable.guide4);
        dataList.add(R.drawable.guide5);

        mAdapter.setDatumList(dataList);

    }

    @Override
    protected void initView() {

        hideStatsBar();//隐藏状态栏
        bt_login_or_register = findViewById(R.id.bt_login_or_register);
        bt_enter = findViewById(R.id.bt_enter);
        bt_login_or_register.setOnClickListener(this);
        bt_enter.setOnClickListener(this);
//        mFlContent = findViewById(R.id.fl_content);
        mViewPager = findViewById(R.id.viewpager);
        mIndicator = findViewById(R.id.circle);

//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fl_content, GuideFragment.newInstance(R.drawable.guide2))
//                .commit();

    }

    /**
     * 点击回调事件
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        //因为有很多个按钮都设置同一个监听器
        //所以这里需要区分到底是哪一个按钮点击
        switch (view.getId()) {
            case R.id.bt_login_or_register:
                showGuide();
                startActivity(LoginOrRegisterActivity.class);
                break;
            case R.id.bt_enter:
                //进入首页按钮
                showGuide();
                startActivity(MainActivity.class);
                break;
        }
    }


    //设置不在显示引导界面
    private void showGuide() {

        PreferenceUtil.getInstance(GuideActivity.this).setShowGuide(false);
    }


}
