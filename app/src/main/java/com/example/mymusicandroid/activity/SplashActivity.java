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

        fullScreen();//全屏

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
