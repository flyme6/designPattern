package com.wistbean.factory.code;

/**
 * Created by wistbean on 2017/10/7.
 */
public class Product implements IProduct {
    @Override
    public void productMethod() {
        System.out.println("产品行为");
    }
}
