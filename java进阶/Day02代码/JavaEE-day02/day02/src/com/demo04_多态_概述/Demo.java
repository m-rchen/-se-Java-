package com.demo04_多态_概述;

/*
    多态
        是在继承/实现情况下的一种现象，表现为对象多态和行为多态

    多态的前提
        1、有继承/实现关系
        2、有方法的重写
        3、存在父类引用指向子类对象

    多态的注意事项
        多态是对象、行为的多态，Java中的属性（成员变量）不涉及多态
 */

// TODO: 能够说出 多态的概念和好处

public class Demo {
    public static void main(String[] args) {
        //3、存在父类引用指向子类对象
        Person p1 = new Student();
        p1.run();
        System.out.println(p1.name);

        Person p2 = new Teacher();
        p2.run();
        System.out.println(p2.name);
    }
}


class Person {
    String name = "姓名";

    public void run() {
        System.out.println("人都会跑步..");
    }
}

//1、有继承/实现关系
class Student extends Person {
    String name = "学生姓名";

    //2、有方法的重写
    @Override
    public void run() {
        System.out.println("学生跑的贼快..");
    }
}

class Teacher extends Person {
    String name = "老师姓名";

    public void teach() {
        System.out.println("老师特有的方法...");
    }

    @Override
    public void run() {
        System.out.println("老师跑的气喘吁吁..");
    }
}


