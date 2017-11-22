package com.wistbean.abstractfactory.example.fashi;

/**
 * Created by wistbean on 2017/11/22.
 * 具体产品 诸葛亮
 */
public class ZhuGeLiang implements AbstractFashi {
    @Override
    public void jiaLan() {
        System.out.println("诸葛亮加蓝咯！");
    }
}
