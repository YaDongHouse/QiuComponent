package com.dong.basemodule;

import android.text.TextUtils;

/**
 * @packInfo:com.dong.basemodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/23
 * Time: 17:44
 */

public class EmptyUtils {

    public static boolean isEmpty(String target) {
        if (target != null && !TextUtils.isEmpty(target)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNotEmpty(String target) {
        if (target != null && !TextUtils.isEmpty(target)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNull(Object obj) {
        return null == obj;
    }

    public static String NullToEmpty(String obj) {
        if (isNull(obj))
            return "";
        else
            return obj;
    }


    public static String getNullString() {
        return "暂无";
    }
}
