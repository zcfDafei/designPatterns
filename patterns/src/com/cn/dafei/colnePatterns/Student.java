package com.cn.dafei.colnePatterns;

public class Student implements Cloneable {

    private String name;
    private int testPaper;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestPaper() {
        return testPaper;
    }

    public void setTestPaper(int testPaper) {
        this.testPaper = testPaper;
    }

    @Override
    protected Student clone(){
       try{
           Student stu=(Student)super.clone();
           return stu;
       }catch (Exception e){
           e.printStackTrace();
       }
        return null;
    }
}
