package com.cn.dafei.factoryMethod;
public class FactoryMethodACupFactory implements ICupFactory {
    @Override
    public ICupFactory create() {
        return new FactoryMethodACupFactory();
    }
}
