package com.cn.dafei.singletonPatterns;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static SeriableSingleton ourInstance = new SeriableSingleton();

    public static SeriableSingleton getInstance() {
        return ourInstance;
    }

    private SeriableSingleton() {

    }

    private Object readResolve(){
        return ourInstance;
    }
}
