package com.wistbean.singleton.example;

/**
 * Created by wistbean on 2017/9/27.
 */
public class RecycleBin {

    private final static RecycleBin instance = new RecycleBin();

    //让该类的构造函数定义为私有（private），这样其它代码没办法去实例化（new）这个对象
    private RecycleBin(){}

    //让该类提供一个静态的方法，且让这个静态方法可以得到这个类的实例。
    public static RecycleBin getInstance()
    {
        return instance;
    }

    public void showDeletedFile()
    {
        System.out.println("显示被删除的文件");
    }

    public void restoreFile()
    {
        System.out.println("还原被删除的文件");
    }

    public void deletFile()
    {
        System.out.println("彻底删除文件");
    }


}
