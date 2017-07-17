package com.fatchao.mvp.View;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fatchao.mvp.Callback.ViewCallBack;
import com.fatchao.mvp.Presenter.MainPresenter;
import com.fatchao.mvp.R;

public class MainActivity extends BaseActivity<MainPresenter, String> implements ViewCallBack<String> {
    private TextView tvDemo;
    private Button btnGet;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        tvDemo = (TextView) findViewById(R.id.tv_demo);
        btnGet = (Button) findViewById(R.id.btn_get);
    }

    public void initListener() {
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getData();
            }
        });
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void refreshView(int code, String data) {
        tvDemo.setText(data);
    }

}
