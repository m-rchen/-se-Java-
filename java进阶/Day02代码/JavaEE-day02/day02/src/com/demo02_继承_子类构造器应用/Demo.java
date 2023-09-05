package com.demo02_继承_子类构造器应用;

/*
    子类构造器应用
        子类构造器可以用来调用父类构造器，将对象中包含父类的这部分数据完成初始化
        再回来完成自己数据的初始化
 */

// TODO: 能够说出 继承后子类构造器访问父类有参构造器的作用

public class Demo {
    public static void main(String[] args) {
        //需求：通过带参构造创建对象并完成初始化
        Teacher t = new Teacher("吴彦祖", 18, "java");
    }
}

//子类Teacher
class Teacher extends Person {
    private String skill;

    //空参构造
    public Teacher() {
    }

    //带参构造
    public Teacher(String name, int age, String skill) {
        //父类中的属性，应该交给父类完成初始化
        super(name, age);
        //子类中的特有属性，子类自己完成初始化
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

//父类Person
class Person {
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
}


//子类Student
class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}


