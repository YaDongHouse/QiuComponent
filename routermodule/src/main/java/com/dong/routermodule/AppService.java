package com.dong.routermodule;

/**
 * @packInfo:com.dong.routermodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/26
 * Time: 9:54
 */

public interface AppService extends ModuleCall {
    //T调用方法自定义
    void showHome();

    void finish();
}
