package com.wistbean.factory.example.using_factory.entity;

/**
 * Created by wistbean on 2017/10/7.
 * 具体产品
 */
public class LenovoComputer implements Computer {

    @Override
    public void describe() {
        System.out.println("联想电脑");
    }
}
