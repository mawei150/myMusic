package com.example.mymusicandroid.activity.base;

import android.view.MenuItem;

import com.example.mymusicandroid.R;

import androidx.annotation.NonNull;
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

        //是否显示返回按钮
        if (isShowBackMenu()) {
            showBackMenu();
        }
    }

    //显示返回按钮
    protected void showBackMenu() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //是否显示返回按钮  不显示可以重写
    protected boolean isShowBackMenu() {
        return true;
    }

    //菜单点击的回调
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
