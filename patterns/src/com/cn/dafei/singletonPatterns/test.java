package com.cn.dafei.singletonPatterns;

import java.io.*;
import java.lang.reflect.Constructor;

public class test {
    public static void main(String[] args) {
        System.out.println(LazyInnerClassSingleton.getInstance());
/*       Thread t1=new ExcutorThread();
        Thread t2=new ExcutorThread();
        t1.run();
        t2.run();
        //反射破坏单例
        Class<?> clazz=LazyInnerClassSingleton.class;
        try{
            Constructor constructor= clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object c1= constructor.newInstance();
            Object c2= constructor.newInstance();
            System.out.println(c1==c2);
        }catch (Exception e){
            System.out.println(e);
        }
        //序列化破坏单例
        SeriableSingleton s1=SeriableSingleton.getInstance();
        SeriableSingleton s2=null;
        try {
            FileOutputStream out=new FileOutputStream("SeriableSingleton.Obj");
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(s1);
            oos.flush();
            oos.close();
            FileInputStream fis=new FileInputStream("SeriableSingleton.Obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s2=(SeriableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
        }catch (Exception e){
            System.out.println(e);
        }
        //枚举式单例
        EnumSingleton es1=EnumSingleton.getInstance();
        EnumSingleton es2=null;
        try {
            FileOutputStream out=new FileOutputStream("EnumSingleton.Obj");
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(es1);
            es1.setData(new Object());
            oos.flush();
            oos.close();
            FileInputStream fis=new FileInputStream("EnumSingleton.Obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            es2=(EnumSingleton)ois.readObject();
            ois.close();
            System.out.println(es2.getData());
            System.out.println(es2.getData());
        }catch (Exception e){
            System.out.println(e);
        }
        //LocalThread单例
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread ts1=new Thread(new ExcutorThread());
        Thread ts2=new Thread(new ExcutorThread());
        ts1.start();
        ts2.start();

        //注册式单例
        try{
            Long start=System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj= ContainerSingleton.getBean("com.cn.dafei.singletonPatterns.LazyDoubleCheckSingletonPattern");
                    System.out.println(obj);
                }
            }, 100,6);
            Long end=System.currentTimeMillis();
            System.out.println("总耗时："+(end-start)+"ms");
        }catch (Exception e){
            System.out.println(e);
        }
          */
    }

}
