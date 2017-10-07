package com.wistbean.factory.example.using_factory;

import com.wistbean.factory.example.using_factory.entity.Computer;
import com.wistbean.factory.example.using_factory.factory.AppleFactory;
import com.wistbean.factory.example.using_factory.factory.ComputerFactory;
import com.wistbean.factory.example.using_factory.factory.LenovoFactory;

/**
 * Created by wistbean on 2017/10/7.
 * 调用
 */
public class Client {

    public static void main(String args[])
    {
        ComputerFactory computerFactory;
        Computer computer;

        //让工厂给我创建一台苹果电脑
        computerFactory = new AppleFactory();
        computer = computerFactory.createComputer();
        computer.describe();

        //让工厂给我创建一台联想电脑
        computerFactory = new LenovoFactory();
        computer = computerFactory.createComputer();
        computer.describe();
    }
}
