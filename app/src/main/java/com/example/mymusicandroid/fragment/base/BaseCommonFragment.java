package com.example.mymusicandroid.fragment.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mymusicandroid.activity.base.BaseCommonActivity;
import com.example.mymusicandroid.util.PreferenceUtil;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author MW
 * @date 2020/8/31
 * <p>
 * 描述：通用公共Fragment
 */

public abstract class BaseCommonFragment  extends BaseFragment{

    protected PreferenceUtil sp;

    @Override
    protected void initView() {
        super.initView();

        //初始化偏好工具类
        sp = PreferenceUtil.getInstance(getMainActivity().getApplicationContext());
    }

    /**
     * 启动界面
     *
     * @param clazz
     */
    protected void startActivity(Class<?> clazz) {
        Intent intent = new Intent(getActivity(), clazz);
        startActivity(intent);
    }

    /**
     * 启动界面并关闭当前界面
     *
     * @param clazz
     */
    protected void startActivityAfterFinishThis(Class<?> clazz) {
        startActivity(new Intent(getMainActivity(), clazz));
        getActivity().finish();
    }

    /**
     * 获取当前Fragment所在的Activity
     *
     * @return
     */
    public BaseCommonActivity getMainActivity() {
        return (BaseCommonActivity) getActivity();
    }

}
