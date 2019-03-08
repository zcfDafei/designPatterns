package com.cn.dafei.factoryMethod;


public class FactoryMethodBCupFactory implements ICupFactory {
    @Override
    public ICupFactory create() {
       return new FactoryMethodBCupFactory();
    }
}
