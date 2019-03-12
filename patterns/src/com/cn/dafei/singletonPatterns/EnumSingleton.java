package com.cn.dafei.singletonPatterns;

public enum EnumSingleton{
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private void EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
