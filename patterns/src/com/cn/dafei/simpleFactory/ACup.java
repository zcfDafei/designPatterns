package com.cn.dafei.simpleFactory;

public class ACup implements ICup{
    @Override
    public void create() {
        System.out.println("我是ACup");
    }
}
