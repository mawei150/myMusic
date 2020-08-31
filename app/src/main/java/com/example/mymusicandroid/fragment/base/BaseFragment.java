package com.example.mymusicandroid.fragment.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author MW
 * @date 2020/8/26
 * <p>
 * 描述：通用父类
 */

public abstract class BaseFragment extends Fragment {
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
     * 返回要显示的View
     * */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);


        return getLayoutView(inflater, container, savedInstanceState);
    }


    protected abstract View getLayoutView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);


    //View创建完毕
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initDatum();
        initListeners();
    }

    //找控件
    public final <T extends View> T findViewById(@IdRes int id) {
        return getView().findViewById(id);
    }

//    public BaseCommonActivity getMainActivity() {
//        return this;
//    }
}
