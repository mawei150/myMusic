package com.example.mymusicandroid.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.util.Constant;

import androidx.fragment.app.Fragment;

/**
 * @author MW
 * @date 2020/8/24
 * <p>
 * 描述：引导页面
 */

public class GuideFragment extends Fragment {

    public GuideFragment() {
        // Required empty public constructor
    }

    //创建方法
    public static GuideFragment newInstance(int id) {
        GuideFragment fragment = new GuideFragment();
        Bundle args = new Bundle();
        args.putInt(Constant.ID,id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }




    //返回要显示的View
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guide, container, false);
    }






}
