package com.wistbean.singleton.example;

/**
 * Created by wistbean on 2017/9/27.
 */
public class RecycleBinTest {

    public static void main(String args[])
    {
        RecycleBin recycleBin = RecycleBin.getInstance();
        RecycleBin recycleBin1 = RecycleBin.getInstance();
        RecycleBin recycleBin2 = RecycleBin.getInstance();

        System.out.println("是否用一个实例：" + (recycleBin == recycleBin1 && recycleBin1== recycleBin2));

        recycleBin.showDeletedFile();
        recycleBin.restoreFile();
        recycleBin.deletFile();
    }
}
