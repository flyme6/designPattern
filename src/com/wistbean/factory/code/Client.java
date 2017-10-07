package com.wistbean.factory.code;

/**
 * Created by wistbean on 2017/10/7.
 */
public class Client {

    public static void main(String args[])
    {
        IFactory factory;
        IProduct product;

        factory = new ProductFactory();
        product = factory.createProduct();

        product.productMethod();
    }

}
