package com.example.mymusicandroid.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.mymusicandroid.MainActivity;
import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseActivity;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;
import com.example.mymusicandroid.fragment.GuideFragment;
import com.example.mymusicandroid.util.PreferenceUtil;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

    }


    @Override
    protected void initDatum() {


    }

    @Override
    protected void initView() {

        hideStatsBar();//隐藏状态栏
        bt_login_or_register = findViewById(R.id.bt_login_or_register);
        bt_enter = findViewById(R.id.bt_enter);
        bt_login_or_register.setOnClickListener(this);
        bt_enter.setOnClickListener(this);
        mFlContent = findViewById(R.id.fl_content);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_content, GuideFragment.newInstance())
                .commit();

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
