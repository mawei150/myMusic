package com.example.mymusicandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseActivity;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;

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
        //找控件
//登录注册按钮
        bt_login_or_register = findViewById(R.id.bt_login_or_register);

//注册按钮
        bt_enter = findViewById(R.id.bt_enter);
//设置点击事件
//设置登录注册按钮点击事件
        bt_login_or_register.setOnClickListener(this);

//设置注册按钮点击事件
        bt_enter.setOnClickListener(this);
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
                startActivity(LoginOrRegisterActivity.class);
                break;
            case R.id.bt_enter:
                //进入按钮
                Log.d(TAG, "onClick enter");
                break;
        }
    }
}
