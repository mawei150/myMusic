package com.example.mymusicandroid.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;


/**
 * @author MW
 * @date 2020/8/18
 * <p>
 * 描述：登录注册界面
 */

public class LoginOrRegisterActivity extends BaseCommonActivity implements View.OnClickListener {


    private Button bt_login;
    private Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
    }

    @Override
    protected void initView() {
        super.initView();
        //查找登录按钮
        bt_login = findViewById(R.id.bt_login);

//查找注册按钮
        bt_register = findViewById(R.id.bt_register);

        //设置登录按钮监听器
        bt_login.setOnClickListener(this);

        //设置注册按钮监听器
        bt_register.setOnClickListener(this);

        ListStatusBar();
    }


    /**
     * 按钮点击回调
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                //登录按钮点击
                startActivity(LoginActivity.class);
                break;
            case R.id.bt_register:
                //注册按钮点击
                startActivity(RegisterActivity.class);
                break;
        }
    }
}
