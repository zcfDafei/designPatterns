package com.cn.dafei.colnePatterns;
import  java.util.List;
import  java.util.ArrayList;
public class test {
    public static void main(String[] args) {
            //给每个学生都发一份试卷
        Student student=new Student();
        List<Student> list=new ArrayList<Student>();
        student.setTestPaper(1);
        for (int i=0;i<50;i++){
            Student stu=student.clone();
            stu.setName("我是第"+i+"个学生");
            list.add(stu);
        }
        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getName()+"试卷"+stu.getTestPaper());
        }
    }
}
