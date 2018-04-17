package com.dong.basemodule;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Toast;

/**
 * @packInfo:com.dong.basemodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/23
 * Time: 17:44
 */

public class CommonUtils {

    public static boolean isDebug(Context context) {
        if (TextUtils.isEmpty(context.getPackageName()))
            return false;
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo(context.getPackageName(), 0);
            return ai != null && (ai.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    //弹出消息
    public static void showToast(final Context context, final String msg) {
        if (EmptyUtils.isEmpty(msg) || EmptyUtils.isNull(context)) {
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Looper.loop();
            }
        }).start();
    }
}
