package com.example.mymusicandroid.activity.base;

import android.content.Intent;


public class BaseCommonActivity extends BaseActivity {

    /**
     * 启动界面
     *
     * @param clazz
     */
    protected void startActivity(Class<?> clazz) {
        startActivity(new Intent(getMainActivity(), clazz));
    }

    /**
     * 启动界面并销毁当前界面
     *
     * @param clazz
     */
    protected void startActivityAfterFinishThis(Class<?> clazz) {
        startActivity(new Intent(getMainActivity(), clazz));
        finish();
    }

    protected BaseCommonActivity getMainActivity() {
        return this;
    }
}
