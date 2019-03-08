package com.cn.dafei.simpleFactory;

public class SimpleFactory {
    public ICup createCup(Class clazz){
       if(clazz!=null){
           try {
               return  (ICup)clazz.newInstance();
           }catch (Exception e){
               e.printStackTrace();
           }
       }
        return null;
    }
}
