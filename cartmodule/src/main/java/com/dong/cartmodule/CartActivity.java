package com.dong.cartmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dong.basemodule.BaseActivity;

public class CartActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cart;
    }

    @Override
    protected void initView() {
        setTitle("购物车");
    }
}
