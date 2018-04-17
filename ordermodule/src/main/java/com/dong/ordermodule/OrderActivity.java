package com.dong.ordermodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dong.basemodule.BaseActivity;

public class OrderActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_order;
    }

    @Override
    protected void initView() {
        setTitle("订单");
    }
}
