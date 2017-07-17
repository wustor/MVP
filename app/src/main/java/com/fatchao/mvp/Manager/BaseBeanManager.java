package com.fatchao.mvp.Manager;


import com.fatchao.mvp.Callback.ViewCallBack;

import java.util.HashMap;

/**
 * author pangchao
 * created on 2017/5/31
 * email fat_chao@163.com.
 */

public abstract class BaseBeanManager {

    protected ViewCallBack mViewCallBack;
    protected HashMap<String, String> paramMap;

    public BaseBeanManager(ViewCallBack modelCallBack) {
        mViewCallBack = modelCallBack;
    }
    public abstract void getData();
}
