package com.dong.cartmodule;

import android.content.Context;

import com.dong.basemodule.CommonUtils;
import com.dong.routermodule.CartModuleService;

/**
 * @packInfo:com.dong.cartmodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/26
 * Time: 15:50
 */

public class CartServiceImpl implements CartModuleService {
    private Context context;

    @Override
    public void initContext(Context context) {
        this.context = context;
    }

    @Override
    public void getCartAmount() {
        //TODO 此处应该为异步操作，如果需要获取网络数据，则需要开启线程，拿到数据之后再回调数据给调用者
        CommonUtils.showToast(context, " 购物车没有商品");
    }
}
