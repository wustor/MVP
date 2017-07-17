package com.fatchao.mvp.Presenter;


import com.fatchao.mvp.Callback.ViewCallBack;
import com.fatchao.mvp.Manager.BaseBeanManager;

import java.util.HashMap;

public abstract class BasePresenter {
    protected BaseBeanManager mBeanManager;
    protected HashMap<String, String> paramMap = new HashMap<>();
    protected ViewCallBack mViewCallBack;

    public BasePresenter(ViewCallBack viewCallBack) {
        mViewCallBack = viewCallBack;
    }


    public void add(ViewCallBack viewCallBack) {
        this.mViewCallBack = viewCallBack;
    }

    public void remove() {
        this.mViewCallBack = null;
    }

    protected abstract void getData();


}
