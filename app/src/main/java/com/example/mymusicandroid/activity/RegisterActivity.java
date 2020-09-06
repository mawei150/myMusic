package com.example.mymusicandroid.activity;

import android.os.Bundle;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;

import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;

/**
 * @author MW
 * @date 2020/9/6
 * <p>
 * 描述：注册页面
 */

public class RegisterActivity extends BaseCommonActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


    @Override
    protected void initView() {
        super.initView();

        setSupportActionBar(mToolbar);
    }
}
