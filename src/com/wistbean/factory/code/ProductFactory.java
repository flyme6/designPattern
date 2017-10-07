package com.wistbean.factory.code;

/**
 * Created by wistbean on 2017/10/7.
 */
public class ProductFactory implements IFactory {
    @Override
    public IProduct createProduct() {
        IProduct product = new Product();
        return product;
    }
}
