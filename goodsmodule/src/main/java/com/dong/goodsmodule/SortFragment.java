package com.dong.goodsmodule;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dong.basemodule.BaseFragment;
import com.dong.routermodule.ReflectUtils;

/**
 * @packInfo:com.dong.goodsmodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/26
 * Time: 15:42
 */

public class SortFragment extends BaseFragment {

    private TextView tvModule;
    private Button btnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_sort;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("分类\nGoodsModule");
        btnButton.setText("跳转到商品详情");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.dong.goodsmodule.GoodsDetailActivity");
            }
        });
        return parent;
    }
}
