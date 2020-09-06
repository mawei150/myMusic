package com.example.mymusicandroid.adapter;

import android.content.Context;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.adapter.base.BaseFragmentPagerAdapter;
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

public class GuideAdapter extends BaseFragmentPagerAdapter<Integer> {

    protected List<Integer> datumList = new ArrayList<>();

    public GuideAdapter(Context context, @NonNull FragmentManager fm) {
        super(context, fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(getData(position));
    }
}
