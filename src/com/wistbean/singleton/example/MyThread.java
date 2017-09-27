package com.wistbean.singleton.example;

/**
 * Created by wistbean on 2017/9/27.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        RecyleBin_LazyLoad instance = RecyleBin_LazyLoad.getInstance();
        System.out.println(instance.hashCode());
    }
}
