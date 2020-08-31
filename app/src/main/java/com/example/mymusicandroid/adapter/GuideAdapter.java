package com.example.mymusicandroid.adapter;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.fragment.GuideFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * @author MW
 * @date 2020/8/31
 * <p>
 * 描述：引导界面适配器
 */

public class GuideAdapter extends FragmentPagerAdapter {

    protected List<Integer> datumList = new ArrayList<>();

    public GuideAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(getData(position));
    }

    private int getData(int position) {

        return datumList.get(position);
    }


    public void setDatumList(List<Integer> datumList) {
        if (datumList != null && datumList.size() > 0) {
            this.datumList.clear();
            this.datumList.addAll(datumList);
            //刷新数据源
            notifyDataSetChanged();
        }
    }

    //返回多少个
    @Override
    public int getCount() {
        return datumList.size();
    }
}
