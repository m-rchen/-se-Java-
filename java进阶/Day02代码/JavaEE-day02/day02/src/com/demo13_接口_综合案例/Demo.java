package com.demo13_接口_综合案例;

import java.util.ArrayList;

/*
    设计一个班级学生信息管理模块
        学生属性：姓名、性别、成绩
        功能包括：打印全部学生信息，打印全班学生的平均成绩

    以上业务实现需要两套方案
        方案1：打印全部学生信息，打印全班学生的平均成绩
        方案2：打印全部学生信息（包含人数），打印全班学生的平均成绩（去掉最高分、最低分）

    通过接口实现业务的灵活切换，实现思路
        1、定义学生类
        2、定义学生操作接口，提供抽象方法
            printStudentInfo(ArrayList<Student> list);
            printAvgScore(ArrayList<Student> list);
        3、定义接口实现类，完成方案1，打印全部学生信息，打印全班学生的平均成绩
        4、定义接口实现类，完成方案2，打印全部学生信息（包含人数），打印全班学生的平均成绩（去掉最高分、最低分）
        5、定义学生管理类
            提供存储学生的容器
            提供学生操作接口，通过多态选择不同实现方案（在这里改等号右边的实现类名即可完成方案切换）
            提供空参构造（构造代码块），加载程序时实例化部分学生数据
            提供方法，方法中通过接口实现不同方案
                public void printStudentInfo(){..}
                public void printAvgScore(){..}
        6、测试类中创建学生管理类对象，测试功能
 */

// TODO: 能够理解 接口的应用案例

public class Demo {
    public static void main(String[] args) {
        //创建学生管理类对象，测试功能
        StudentManager sm = new StudentManager();
        sm.printStudentInfo();
        sm.printAvgScore();
    }
}

//5、定义学生管理类
class StudentManager {
    //提供存储学生的容器
    private static ArrayList<Student> list = new ArrayList<>();

    //提供学生操作接口，通过多态选择不同实现方案（在这里改等号右边的实现类名即可完成方案切换）
    //private StudentOperator studentOperator = new StudentOperatorImpl1();
    private StudentOperator studentOperator = new StudentOperatorImpl2();

    //提供空参构造，加载程序时实例化部分学生数据
//    public StudentManager() {
//        list.add(new Student("张飞", '男', 65));
//        list.add(new Student("关羽", '男', 85));
//        list.add(new Student("貂蝉", '男', 100));
//        list.add(new Student("刘备", '男', 90));
//        list.add(new Student("小乔", '女', 70));
//    }

    //提供构造代码块，加载程序时实例化部分学生数据
    {
        list.add(new Student("张飞", '男', 65));
        list.add(new Student("关羽", '男', 85));
        list.add(new Student("貂蝉", '男', 100));
        list.add(new Student("刘备", '男', 90));
        list.add(new Student("小乔", '女', 70));
    }

    //功能1打印全部学生信息
    public void printStudentInfo() {
        //如果给出具体实现，后期改方案就要改代码，这里的功能通过接口实现
        studentOperator.printStudentInfo(list);
    }

    //功能2打印全班学生的平均成绩
    public void printAvgScore() {
        //如果给出具体实现，后期改方案就要改代码，这里的功能通过接口实现
        studentOperator.printAvgScore(list);
    }
}


//4、定义接口实现类，完成方案2，打印全部学生信息（包含人数），打印全班学生的平均成绩（去掉最高分、最低分)
class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printStudentInfo(ArrayList<Student> list) {
        int man = 0;
        int woman = 0;
        System.out.println("姓名   性别   成绩");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender() == '男') man++;
            if (list.get(i).getGender() == '女') woman++;
            Student stu = list.get(i);
            System.out.println(stu.getName() + "   " + stu.getGender() + "   " + stu.getScore());
        }
        System.out.println("男生人数:" + man);
        System.out.println("女生人数:" + woman);
    }

    @Override
    public void printAvgScore(ArrayList<Student> list) {
        double max = list.get(0).getScore();
        double min = list.get(0).getScore();
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getScore() > max) max = list.get(i).getScore();
            if (list.get(i).getScore() < min) min = list.get(i).getScore();
            sum += list.get(i).getScore();
        }
        System.out.println("最低分:" + min);
        System.out.println("最高分:" + max);
        System.out.println("平均分:" + (sum - max - min) / (list.size() - 2));
    }
}

//3、定义接口实现类，完成方案1，打印全部学生信息，打印全班学生的平均成绩
class StudentOperatorImpl1 implements StudentOperator {
    @Override
    public void printStudentInfo(ArrayList<Student> list) {
        System.out.println("姓名   性别   成绩");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "   " + stu.getGender() + "   " + stu.getScore());
        }
    }

    @Override
    public void printAvgScore(ArrayList<Student> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }
        System.out.println("平均分:" + (sum / list.size()));
    }
}

//2、定义学生操作接口，提供抽象方法
interface StudentOperator {
    void printStudentInfo(ArrayList<Student> list);
    void printAvgScore(ArrayList<Student> list);
}

//1、定义学生类
class Student {
    private String name;
    private char gender;
    private double score;

    public Student() {
    }

    public Student(String name, char gender, double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
