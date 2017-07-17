package com.fatchao.mvp.Presenter;

import com.fatchao.mvp.Callback.ViewCallBack;
import com.fatchao.mvp.Manager.MainManager;

/**
 * Created by fatchao
 * 日期  2017-07-17.
 * 邮箱  fat_chao@163.com
 */

public class MainPresenter extends BasePresenter {

    public MainPresenter(ViewCallBack viewCallBack) {
        super(viewCallBack);
    }


    public void getData() {
        mBeanManager = new MainManager(mViewCallBack);
        mBeanManager.getData();
    }
}
