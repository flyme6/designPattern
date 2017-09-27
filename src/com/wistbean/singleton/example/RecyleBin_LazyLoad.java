package com.wistbean.singleton.example;

/**
 * Created by wistbean on 2017/9/27.
 */
public class RecyleBin_LazyLoad {

    private volatile static RecyleBin_LazyLoad instance;

    //让该类的构造函数定义为私有（private），这样其它代码没办法去实例化（new）这个对象
    private RecyleBin_LazyLoad(){}

    //需要的时候才去加载实例
    public static RecyleBin_LazyLoad getInstance()
    {
        if(instance==null)
        {
            synchronized (RecyleBin_LazyLoad.class)
            {
                if(instance==null){

                    instance = new RecyleBin_LazyLoad();
                }
            }
        }

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
