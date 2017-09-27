package com.wistbean.singleton.code;

/**
 * Created by wistbean on 2017/9/27.
 * 单例模式 以内部类的形式实现
 */
public class IodhiSigleton {

    private IodhiSigleton(){}

    private static class LazyHolder
    {
        private final static IodhiSigleton INSTANCE = new IodhiSigleton();
    }

    public static IodhiSigleton getInstance()
    {
        return LazyHolder.INSTANCE;
    }


}
