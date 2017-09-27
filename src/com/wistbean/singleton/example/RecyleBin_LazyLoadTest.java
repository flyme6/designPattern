package com.wistbean.singleton.example;

/**
 * Created by wistbean on 2017/9/27.
 */
public class RecyleBin_LazyLoadTest {

    public static void main(String args[])
    {
       while(true)
       {
           new Thread(new MyThread()).start();
       }
    }
}
