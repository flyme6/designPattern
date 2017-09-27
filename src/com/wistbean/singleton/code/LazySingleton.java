package com.wistbean.singleton.code;

/**
 * Created by wistbean on 2017/9/27.
 * 单例模式：懒汉式方式实现
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance()
    {
        if(instance == null)
        {
            synchronized (LazySingleton.class)
            {
                if(instance==null)
                {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

}
