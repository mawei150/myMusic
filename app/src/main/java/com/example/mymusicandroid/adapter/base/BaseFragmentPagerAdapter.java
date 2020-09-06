package com.example.mymusicandroid.adapter.base;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * @author MW
 * @date 2020/8/31
 * <p>
 * 描述：* 通用FragmentPagerAdapter
 * * 主要是创建了列表
 * * 实现了通用的方法
 * * 直接用FragmentPagerAdapter有可能有内存泄漏
 * * 所以使用FragmentStatePagerAdapter
 * * 具体的这里不讲解
 * * 会在详解系列课程中讲解
 */

public abstract class BaseFragmentPagerAdapter<T> extends FragmentStatePagerAdapter {
    protected List<T> datumList = new ArrayList<>();
    protected Context context;

    public BaseFragmentPagerAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context.getApplicationContext();
    }


    @Override
    public int getCount() {
        return datumList.size();
    }


    protected T getData(int position) {

        return datumList.get(position);
    }


    public void setDatumList(List<T> datumList) {
        if (datumList != null && datumList.size() > 0) {
            this.datumList.clear();
            this.datumList.addAll(datumList);
            //刷新数据源
            notifyDataSetChanged();
        }
    }

    //添加数据
    public void addDatumList(List<T> datumList) {
        if (datumList != null && datumList.size() > 0) {
//            this.datumList.clear();
            this.datumList.addAll(datumList);
            //刷新数据源
            notifyDataSetChanged();
        }
    }
}
