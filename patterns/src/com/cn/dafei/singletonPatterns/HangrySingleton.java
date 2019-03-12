package com.cn.dafei.singletonPatterns;

public class HangrySingleton {
    private static HangrySingleton ourInstance = new HangrySingleton();

    public static HangrySingleton getInstance() {
        return ourInstance;
    }

    private HangrySingleton() {
        if(ourInstance !=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

}
