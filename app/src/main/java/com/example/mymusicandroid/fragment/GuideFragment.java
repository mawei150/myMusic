package com.example.mymusicandroid.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mymusicandroid.R;
import com.example.mymusicandroid.fragment.base.BaseCommonFragment;
import com.example.mymusicandroid.fragment.base.BaseFragment;
import com.example.mymusicandroid.util.Constant;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author MW
 * @date 2020/8/24
 * <p>
 * 描述：引导页面
 */

public class GuideFragment extends BaseCommonFragment {

    private ImageView mIv;

    public GuideFragment() {
        // Required empty public constructor
    }

    //创建方法
    public static GuideFragment newInstance(int id) {
        GuideFragment fragment = new GuideFragment();
        Bundle args = new Bundle();
        args.putInt(Constant.ID, id);
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
    protected View getLayoutView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guide, container, false);
    }


    @Override
    protected void initView() {
        super.initView();

        mIv =findViewById(R.id.iv);
    }


    @Override
    protected void initDatum() {
        super.initDatum();
        int id = getArguments().getInt(Constant.ID, -1);
        if (id == -1) {
            //传递的数据有问题
            getActivity().finish();
            return;
        } else {
            mIv.setImageResource(id);
        }

    }

}
