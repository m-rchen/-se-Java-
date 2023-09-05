package com.demo09_抽象类_好处;

/*
    抽象类的应用场景和好处
        1、将所有子类中重复的代码，抽取到抽象的父类中，提高了代码的复用性（先编写子类，再编写抽象类）
        2、我们不知道系统未来具体的业务时，可以先定义抽象类，将来让子类去继承实现，提高了代码的扩展性（先编抽象类，再编写子类）

    案例导学
        使用抽象类完成，不同岗位员工（程序员、项目经理）各自工作的案例
 */

public class Demo {
    public static void main(String[] args) {
        //测试对象（属性可以不关心）
        Manager m = new Manager("老张",38,20000);
        m.work();

        Person p1 = new Manager("老张",38,20000);
        p1.work(); //编译看左，运行看右

        Coder c = new Coder();
        c.work();

        Person p2 = new Coder();
        p2.work();; //编译看左，运行看右
    }
}

//子类Manager
class Manager extends Person{
    //奖金
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("项目经理谈需求..");
    }
}

//子类Coder
class Coder extends Person {
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("程序员写代码..");
    }
}

//父类Person
abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //由于每个人（子类）的工作不一样
    //所以我们在父类中只提供方法声明，等着子类来重写
    public abstract void work();
}