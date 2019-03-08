package com.cn.dafei.abstractFactory;

public abstract class  AbsFactory implements  IAbstractFactoryWork {
    @Override
    public String doClockIn() {
        return "今天已打卡";
    }
    public abstract String work();
}
