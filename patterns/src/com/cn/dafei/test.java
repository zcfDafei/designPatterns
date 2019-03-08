package com.cn.dafei;
import com.cn.dafei.abstractFactory.IAbstractFactoryWork;
import com.cn.dafei.abstractFactory.Worker1;
import com.cn.dafei.factoryMethod.ICupFactory;
import com.cn.dafei.factoryMethod.FactoryMethodACupFactory;
import com.cn.dafei.simpleFactory.ACup;
import com.cn.dafei.simpleFactory.ICup;
import com.cn.dafei.simpleFactory.SimpleFactory;

public class test {
    public static void main(String[] args) {
        /**
         * 单一工厂模式
         */
        SimpleFactory factory=new SimpleFactory();
        ICup cup=factory.createCup(ACup.class);
        cup.create();
        /**
         * 工厂方法模式
         */
        ICupFactory method=new FactoryMethodACupFactory();
        method.create();
        /**
         * 抽象工厂模式
         */
        IAbstractFactoryWork work=new Worker1();
        System.out.println(work.doClockIn());
        System.out.println(((Worker1) work).work());
    }
}
