package com.example.mymusicandroid.adapter;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.fragment.GuideFragment;

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


    public GuideAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(R.drawable.guide2);
    }


    //返回多少个
    @Override
    public int getCount() {
        return 10;
    }
}
