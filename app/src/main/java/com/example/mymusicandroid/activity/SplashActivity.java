package com.example.mymusicandroid.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.activity.base.BaseCommonActivity;

/**
 * @author MW
 * @date 2020/8/10
 * <p>
 * 描述：启动界面
 */
public class SplashActivity extends BaseCommonActivity {

    private static final int MESSAGE_TEST = 100;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_TEST:
                    next();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        intView();
    }


    private void intView() {
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

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                message.what = MESSAGE_TEST;

                handler.sendMessage(message);

            }
        }, 300);
    }


    private void next() {
//        Toast.makeText(SplashActivity.this, "我是是", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(SplashActivity.this, GuideActivity.class);
        startActivity(intent);
        finish();
    }

}
