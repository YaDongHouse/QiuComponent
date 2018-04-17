package com.dong.component.debug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dong.basemodule.BaseActivity;
import com.dong.component.R;

public class MainDebugActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main_debug;
    }

    @Override
    protected void initView() {
        setTitle("主页面");
    }
}
