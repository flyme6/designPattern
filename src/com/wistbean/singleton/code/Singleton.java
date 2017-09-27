package com.wistbean.singleton.code;

/**
 * Created by wistbean on 2017/9/27.
 * 单例模式：饿汉式方式实现
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance()
    {
        return INSTANCE;
    }

}
