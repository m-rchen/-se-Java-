package com.day01homework;

/*
    分析以下需求并完成代码
        请使用继承思想，实现程序员类(Coder)和项目经理类(Manager)

        思路分析
            共同属性有：工号、姓名、年龄
            项目经理类有一个特有属性：奖金(bonus)
            公共方法有：工作
            测试类中创建程序员、项目经理对象，分别调用work方法，要求打印结果如图所示
*/
public class Demo {
    public static void main(String[] args) {
        //测试类中创建程序员、项目经理对象，分别调用work方法，要求打印结果如图所示
        Coder c = new Coder();
        c.setId("9527");
        c.setName("小李");
        c.setAge(26);
        c.work();

        Manager m = new Manager();
        m.setId("001");
        m.setName("老张");
        m.setAge(38);
        m.setBonus(20000);
        m.work();
    }
}

class Person {
    //共同属性有：工号、姓名、年龄
    private String id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    //公共方法有：工作
    public void work() {
        System.out.println("人都要工作");
    }
}

class Coder extends Person {
    //重写work方法
    @Override
    public void work() {
        //具体打印什么，看控制台
        System.out.println("工号为" + getId() + "的程序员" + getName() + "根据需求完成代码，" + getAge() + "岁就月薪过万了");
    }
}

class Manager extends Person {
    //项目经理类有一个特有属性：奖金(bonus)
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重写work方法

    @Override
    public void work() {
        //具体打印什么，看控制台
        System.out.println("工号为" + getId() + "的项目经理" + getName() + "在和客户谈需求，项目奖金" + bonus + "但是" + getAge() + "岁了还没结婚");
    }
}