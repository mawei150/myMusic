package com.example.mymusicandroid.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author MW
 * @date 2020/8/18
 * <p>
 * 描述：偏好设置工具类
 */

public class PreferenceUtil {

    /**
     * 偏好设置文件名称
     */
    private static final String NAME = "ixuea_my_cloud_music";
    private static PreferenceUtil instance;
    private SharedPreferences sharedPreferences;
    //上下文
    private Context mContext;

    /**
     * 是否显示引导界面key
     */
    private static final String SHOW_GUIDE = "SHOW_GUIDE";

    public PreferenceUtil(Context context) {
        this.mContext = context.getApplicationContext();
        //这样写有内存泄漏
        //因为当前工具类不会马上释放
        //如果当前工具类引用了界面实例
        //当界面关闭后
        //因为界面对应在这里还有引用
        //所以会导致界面对象不会被释放
        //this.context = context;
        sharedPreferences = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    //获取偏好设置单例
    public static PreferenceUtil getInstance(Context context) {
        if (instance == null) {
            instance = new PreferenceUtil(context);
        }
        return instance;
    }


    //是否显示引导界面
    public boolean isShowGuide() {
        return sharedPreferences.getBoolean(SHOW_GUIDE, true);
    }

    /**
     * 设置是否显示引导界面
     *
     * @param value
     */
    public void setShowGuide(boolean value) {
        sharedPreferences.edit().putBoolean(SHOW_GUIDE, value).commit();
    }

}
