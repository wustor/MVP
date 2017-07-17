package com.fatchao.mvp.Manager;

import com.fatchao.mvp.Callback.ViewCallBack;

/**
 * Created by fatchao
 * 日期  2017-07-17.
 * 邮箱  fat_chao@163.com
 */

public class MainManager extends BaseBeanManager {

    public MainManager(ViewCallBack modelCallBack) {
        super(modelCallBack);
    }

    public void getData() {
        mViewCallBack.refreshView(1, "MVP返回的数据");
    }
}
