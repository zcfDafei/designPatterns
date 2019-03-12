package com.cn.dafei.singletonPatterns;

public class ExcutorThread extends Thread {
    @Override
    public void run() {
//        LazyDoubleCheckSingletonPattern lazy= LazyDoubleCheckSingletonPattern.getInstance();
//        LazyInnerClassSingleton lazy= LazyInnerClassSingleton.getInstance();
//        System.out.println("单例模式："+lazy);
        ThreadLocalSingleton threadLocalSingleton=ThreadLocalSingleton.getInstance();

        System.out.println(this.getName()+"单例模式："+threadLocalSingleton);
    }
}
