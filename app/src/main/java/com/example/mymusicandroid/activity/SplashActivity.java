package com.example.mymusicandroid.activity;

import android.annotation.SuppressLint;;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;

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



    @Override
    protected void initDatum() {
        super.initDatum();
    }


    private void next() {


//        if (mPreferenceUtil.isShowGuide()) {
//            //显示引导界面
            startActivityAfterFinishThis(GuideActivity.class);
//        } else {
//            //登录/注册页面
//            startActivityAfterFinishThis(LoginOrRegisterActivity.class);
//        }

    }

}
