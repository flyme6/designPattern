package com.wistbean.factory.example.using_factory.factory;

import com.wistbean.factory.example.using_factory.entity.AppleComputer;
import com.wistbean.factory.example.using_factory.entity.Computer;

/**
 * Created by wistbean on 2017/10/7.
 * 具体工厂
 */
public class AppleFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {

        //这里主要为了演示工厂方法模式，组装电脑的代码省略...

        Computer appleComputer = new AppleComputer();

        return appleComputer;
    }
}
