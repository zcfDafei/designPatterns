package com.cn.dafei.singletonPatterns;

public class LazyInnerClassSingleton {

    public static LazyInnerClassSingleton getInstance() {
        System.out.println("LazyInnerClassSingleton-getInstance");
        return LazyInner.LAZY;
    }
    {
        System.out.println("LazyInnerClassSingleton普通代码块");
    }
    static{
        System.out.println("static----LazyInnerClassSingleton");
    }

    private LazyInnerClassSingleton() {
        System.out.println("LazyInnerClassSingleton");
        if(LazyInner.LAZY!=null)
            throw new RuntimeException("不能实例化多个");
    }
    private static class LazyInner{
        static{
            System.out.println("static LazyInner");
        }
        {
            System.out.println("LazyInner普通代码块");
        }
        private LazyInner(){
            System.out.println("LazyInner");
        }
        private static final LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
    }
}
