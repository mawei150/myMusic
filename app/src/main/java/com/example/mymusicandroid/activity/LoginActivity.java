package com.example.mymusicandroid.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseTitleActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author MW
 * @date 2020/9/6
 * <p>
 * 描述：登录页面
 */

public class LoginActivity extends BaseTitleActivity {

    @BindView(R.id.et_username)
    EditText mEtUsername;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.bt_login)
    Button mBtLogin;
    @BindView(R.id.bt_forget_password)
    Button mBtForgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @OnClick({R.id.et_username, R.id.et_password, R.id.bt_login, R.id.bt_forget_password})
    protected void onClickView(View view) {
        switch (view.getId()) {
            case R.id.et_username:
                break;
            case R.id.et_password:
                break;
            case R.id.bt_login:
                break;
            case R.id.bt_forget_password:
                break;
        }
    }

}
