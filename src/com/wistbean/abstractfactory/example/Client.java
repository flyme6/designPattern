package com.wistbean.abstractfactory.example;

import com.wistbean.abstractfactory.example.cike.AbstractCiKe;
import com.wistbean.abstractfactory.example.factory.AbstractFactory;
import com.wistbean.abstractfactory.example.factory.GirlFactory;
import com.wistbean.abstractfactory.example.fashi.AbstractFashi;

/**
 * Created by wistbean on 2017/11/22.
 */
public class Client {
    public static void main(String[] args){
        //要从工厂里边取女的人物
         AbstractFactory girlFactory;
         AbstractCiKe ciKe;
         AbstractFashi fashi;
        //获取工厂
        girlFactory = new GirlFactory();
        //获取刺客中女的人物
        ciKe = girlFactory.createCiKe();
        //获取法师中女的人物
        fashi = girlFactory.createFashi();

        ciKe.jiaShanHai();
        fashi.jiaLan();
    }
}
