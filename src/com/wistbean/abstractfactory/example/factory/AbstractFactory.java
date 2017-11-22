package com.wistbean.abstractfactory.example.factory;

import com.wistbean.abstractfactory.example.cike.AbstractCiKe;
import com.wistbean.abstractfactory.example.fashi.AbstractFashi;

/**
 * Created by wistbean on 2017/11/22.
 * 抽象工厂 声明一组创建产品族的方法
 */
 public interface AbstractFactory {
    AbstractFashi createFashi();
    AbstractCiKe createCiKe();
}
