package com.demo03_继承_this调用兄弟构造器;

/*
    this(..)调用兄弟构造器
        任意类的构造器中，都可以通过super(..)去调用该类的其它构造器

    注意事项
        this(..)和super(..)都只能放在构造器的第一行，所以不能重复出现
 */

// TODO: 能够说出 this和super的常见作用

public class Demo {
    public static void main(String[] args) {
        //需求：通过带参构造创建对象并完成初始化
        Student s1 = new Student("吴彦祖", 18, "家里蹲大学");

        //需求：如果用户没有指定学校，默认学校为"黑马程序员"
        Student s2 = new Student("周杰伦", 20);

    }
}

class Student {
    private String name;
    private int age;
    private String school;

    //构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this(name, age, "黑马程序员");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}



