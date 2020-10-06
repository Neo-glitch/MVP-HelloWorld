package com.neo.mvphelloworld.presenter;


import android.view.View;

import com.neo.mvphelloworld.contract.MainActivityContract;
import com.neo.mvphelloworld.model.MainActivityModel;

/**
 * Presenter: does bus logic, and implements an interface used for comm btw View and Model
 */
public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View mView;      // listener for view interface
    private MainActivityContract.Model mModel;    // listener for model interface


    public MainActivityPresenter(MainActivityContract.View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        // fun gets data from model and then calls the View(activity) serViewData fun
        String data = mModel.getData();
        mView.setViewData(data);

    }
}
