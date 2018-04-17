package com.dong.usermodule;

import com.dong.basemodule.BaseActivity;

public class UserActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_user;
    }

    @Override
    protected void initView() {
        setTitle("用户");
    }
}
