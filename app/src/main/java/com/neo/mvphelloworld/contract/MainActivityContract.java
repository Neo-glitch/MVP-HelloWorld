package com.neo.mvphelloworld.contract;


import android.view.View;


public interface MainActivityContract {

    interface View{   // rule interface to be implemented by View
        void initView();
        void setViewData(String data);
    }

    interface Model{    // rule interface to be implemented by model
        String getData();
    }

    interface Presenter{    // rule interface to be implemented by Presenter
        void onClick(android.view.View view);
    }
}
