package com.wistbean.abstractfactory.example.factory;

import com.wistbean.abstractfactory.example.cike.AKe;
import com.wistbean.abstractfactory.example.cike.AbstractCiKe;
import com.wistbean.abstractfactory.example.fashi.AbstractFashi;
import com.wistbean.abstractfactory.example.fashi.AnQiLa;

/**
 * Created by wistbean on 2017/11/22.
 * 具体工厂 实现抽象工厂的方法，生成具体产品 构成产品族
 */
public class GirlFactory implements AbstractFactory {
    @Override
    public AbstractFashi createFashi() {
        return new AnQiLa();
    }

    @Override
    public AbstractCiKe createCiKe() {
        return new AKe();
    }
}
