package com.dong.basemodule;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @packInfo:com.dong.basemodule
 * @author: yadong.qiu
 * Created by 邱亚东
 * Date: 2018/3/23
 * Time: 17:44
 */

public abstract class BaseFragment extends Fragment {

    protected Context mContext;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(getLayoutId(), container, false);
        return initView(view);
    }


    protected abstract int getLayoutId();

    protected abstract View initView(View parent);
}
