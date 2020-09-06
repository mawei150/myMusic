package com.example.mymusicandroid.activity.base;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.mymusicandroid.R;

import butterknife.ButterKnife;


public class BaseCommonActivity extends BaseActivity {



    //设置全屏
    protected  void fullScreen(){
        //设置界面全屏
        View decorview = getWindow().getDecorView();//获取根布局

        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {//19->4.4
            decorview.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {

            //19及以上版本
            //SYSTEM_UI_FLAG_HIDE_NAVIGATION:隐藏导航栏
            //SYSTEM_UI_FLAG_IMMERSIVE_STICKY:从状态栏下拉会半透明悬浮显示一会儿状态栏和导航栏
            //SYSTEM_UI_FLAG_FULLSCREEN:全屏
            int options = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                    View.SYSTEM_UI_FLAG_FULLSCREEN;
            //设置到控件
            decorview.setSystemUiVisibility(options);
        }

    }

    @Override
    protected void initView() {
        super.initView();
        //初始化注解找控件
        //绑定方法框架
        if (isBindView()) {
            bindView();
        }
    }

    /**
     * 是否绑定View
     *
     * @return
     */
    protected boolean isBindView() {
        return true;
    }

    /**
     * 绑定View
     */
    protected void bindView() {
        ButterKnife.bind(this);
    }

    protected void ListStatusBar() {

        if (Build.VERSION.SDK_INT>=21){
            Window window=getWindow();

            //背景颜色设为透明
            window.setStatusBarColor(Color.TRANSPARENT);

            //去除半透明结果(如果有)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            //SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN：让内容显示到状态栏
            //SYSTEM_UI_FLAG_LAYOUT_STABLE：状态栏文字显示白色
            //SYSTEM_UI_FLAG_LIGHT_STATUS_BAR：状态栏文字显示黑色
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            );


        }

    }


    //隐藏状态栏
    protected void  hideStatsBar(){
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

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
