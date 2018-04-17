package com.dong.usermodule;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dong.basemodule.BaseFragment;
import com.dong.routermodule.ReflectUtils;

/**
 * @packInfo:com.dong.usermudule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/26
 * Time: 11:41
 */

public class MineFragment extends BaseFragment {

    private TextView tvModule;
    private Button btnButton;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("用户中心\nUserModule");
        btnButton.setText("跳转订单");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.dong.ordermodule.OrderActivity");
            }
        });
        return parent;
    }
}
