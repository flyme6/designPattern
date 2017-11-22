package com.wistbean.abstractfactory.example.cike;

/**
 * Created by wistbean on 2017/11/22.
 * 具体产品 赵云
 */
public class ZhaoYun implements AbstractCiKe {
    @Override
    public void jiaShanHai() {
        System.out.println("赵云加伤害咯！");
    }
}
