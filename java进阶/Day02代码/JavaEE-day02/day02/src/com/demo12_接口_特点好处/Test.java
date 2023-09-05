package com.demo12_接口_特点好处;

/*
    接口特点、好处
        1、弥补了类单继承的不足，一个类同时可以实现多个接口（实现了多个接口的类，创建出来的对象，会拥有更多的功能）
        2、让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现（编写接口，让需要的类实现即可）
 */

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.work();
        c.drive();
        c.cook();
        c.sing();
    }
}

//抽象父类：人类
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

    public abstract void work();
}

//子类：程序员（开车，烹饪，唱歌）
class Coder extends Person implements Drive, Cook, Sing {
    @Override
    public void work() {
        System.out.println("程序员在敲代码..");
    }

    @Override
    public void drive() {
        System.out.println("程序员学会了开车..");
    }

    @Override
    public void cook() {
        System.out.println("程序员学会了烹饪..");
    }

    @Override
    public void sing() {
        System.out.println("程序员学会了唱歌..");
    }
}

//子类：学生（开车）
class Student extends Person implements Drive {
    @Override
    public void work() {
        System.out.println("学生正在找工作..");
    }

    @Override
    public void drive() {
        System.out.println("学生学会了开车..");
    }
}

//接口：开车Drive
interface Drive {
    public abstract void drive();
}

//接口：烹饪Cook
interface Cook {
    public abstract void cook();
}

//接口：唱歌Sing
interface Sing {
    public abstract void sing();
}




