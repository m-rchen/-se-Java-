package com.day01homework;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //快捷键重写，idea有模板
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student("吴彦祖", 18);
        System.out.println(s);

        //打印对象（底层会调用toString方法，返回字符串的地址）
        //我们看地址没意义，我们想看属性
        //结论：重写该类的toString方法
    }
}
