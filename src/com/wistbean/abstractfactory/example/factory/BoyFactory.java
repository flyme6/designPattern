package com.wistbean.abstractfactory.example.factory;

import com.wistbean.abstractfactory.example.cike.AbstractCiKe;
import com.wistbean.abstractfactory.example.cike.ZhaoYun;
import com.wistbean.abstractfactory.example.fashi.AbstractFashi;
import com.wistbean.abstractfactory.example.fashi.ZhuGeLiang;

/**
 * Created by wistbean on 2017/11/22.
 * 具体工厂 实现抽象工厂的方法，生成具体产品 构成产品族
 */
public class BoyFactory implements AbstractFactory {
    @Override
    public AbstractFashi createFashi() {
        return new ZhuGeLiang();
    }

    @Override
    public AbstractCiKe createCiKe() {
        return new ZhaoYun();
    }
}
