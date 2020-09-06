package com.example.mymusicandroid.activity.base;

import com.example.mymusicandroid.R;

import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;

/**
 * @author MW
 * @date 2020/9/7
 * <p>
 * 描述：带标题ToolBar 的Activity
 */

public class BaseTitleActivity extends BaseCommonActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void initView() {
        super.initView();

        setSupportActionBar(mToolbar);
    }
}
