package com.example.mymusicandroid.activity.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author MW
 * @date 2020/8/17
 * <p>
 * 描述：
 */

public class BaseActivity extends AppCompatActivity {

    /*
     * 找控件
     * */
    protected void initView() {

    }

    /*
     * 设置数据
     * */
    protected void initDatum() {

    }

    /*
     * 设置监听器
     * */
    protected void initListeners() {

    }

    /*
    在onCreate方法之后调用
    */
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        initView();
        initDatum();
        initListeners();
    }
}
