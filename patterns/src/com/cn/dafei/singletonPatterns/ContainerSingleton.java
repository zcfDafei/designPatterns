package com.cn.dafei.singletonPatterns;

import com.sun.deploy.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static Map<String,Object> currentMap=new ConcurrentHashMap<String,Object>();
    private ContainerSingleton(){}

    public static Object getBean(String className){
        if(!currentMap.containsKey(className)){
            try{
                Object obj=Class.forName(className).newInstance();
                currentMap.put(className,obj);
                return obj;
            }catch (Exception e){
                System.out.println(e);
            }
        }else{
            return currentMap.get(className);
        }
        return null;
    }
}
