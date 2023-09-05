package com.demo08_抽象类_概述;


/*
    抽象方法和抽象类
        Java中有一个关键字abstract，它就是抽象的意思，可以用来修饰类、成员方法
            abstract修饰类，这个类就是抽象类
            abstract修饰方法，这个方法就是抽象方法

    抽象类的特点
        1、抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
        2、抽象类中可以声明成员变量、成员方法、构造器
        3、抽象类不能被实例化，它仅作为一种特殊的类，让子类继承并实现
        4、抽象类的子类，要么重写所有抽象方法，要么将自己也声明为抽象类
 */

// TODO: 能够说出 抽象类和抽象方法的概念
// TODO: 能够说出 抽象类的特点
// TODO: 能够说出 类继承抽象类后必须怎么办

public class Demo {
    public static void main(String[] args) {
        //3、抽象类不能被实例化，它仅作为一种特殊的类，让子类继承并实现
        //Person p = new Person();

        //具体类创建对象
        Student s = new Student();
        s.work(); //学生在找工作..

        //多态创建对象
        Person p = new Student();
        p.work(); //学生在找工作..
    }
}

//4、抽象类的子类，要么重写所有抽象方法，要么将自己也声明为抽象类（不推荐）
/*abstract*/ class Student extends Person{
    @Override
    public void work() {
        System.out.println("学生在找工作..");
    }
}

//1、抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
abstract class Person{
    public abstract void work();
    //2、抽象类中可以声明成员变量、成员方法、构造器
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
