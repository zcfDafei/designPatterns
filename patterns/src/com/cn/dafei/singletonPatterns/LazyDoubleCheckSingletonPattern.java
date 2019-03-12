package com.cn.dafei.singletonPatterns;

public class LazyDoubleCheckSingletonPattern {
    static LazyDoubleCheckSingletonPattern lazyDoubleCheckSingletonPattern =null;
    private void LazySingletonPatterns(){}
    public static LazyDoubleCheckSingletonPattern getInstance(){
        if(lazyDoubleCheckSingletonPattern ==null){
            synchronized (LazyDoubleCheckSingletonPattern.class) {
                if (lazyDoubleCheckSingletonPattern == null) {
                    lazyDoubleCheckSingletonPattern = new LazyDoubleCheckSingletonPattern();
                }
            }
        }
        return lazyDoubleCheckSingletonPattern;
    }
}