package com.example.mymusicandroid.activity.base;

import android.os.Bundle;

import com.example.mymusicandroid.util.PreferenceUtil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author MW
 * @date 2020/8/17
 * <p>
 * 描述：
 */

public class BaseActivity extends AppCompatActivity {


    protected PreferenceUtil mPreferenceUtil;//偏好设置实例

    /*
     * 找控件
     * */
    protected void initView() {

    }

    /*
     * 设置数据
     * */
    protected void initDatum() {
        mPreferenceUtil = PreferenceUtil.getInstance(BaseActivity.this);
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
