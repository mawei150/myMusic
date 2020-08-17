package com.example.mymusicandroid.activity.base;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;


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
