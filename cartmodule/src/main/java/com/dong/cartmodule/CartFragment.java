package com.dong.cartmodule;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dong.basemodule.BaseFragment;
import com.dong.routermodule.ReflectUtils;

/**
 * @packInfo:com.dong.cartmodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/26
 * Time: 15:49
 */

public class CartFragment extends BaseFragment {

    private TextView tvModule;
    private Button btnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cart;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("购物车\nCartModule");
        btnButton.setText("跳转商品详情");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.dong.goodsmodule.GoodsDetailActivity");

            }
        });
        return parent;
    }
}
