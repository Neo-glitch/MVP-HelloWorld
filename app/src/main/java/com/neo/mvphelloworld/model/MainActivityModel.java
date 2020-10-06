package com.neo.mvphelloworld.model;


import com.neo.mvphelloworld.contract.MainActivityContract;

/**
 * Model: can be a ModelClass as normal or also used for db and api services
 */
public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getData() {
        return "Welcome to MVP arch";
    }
}
