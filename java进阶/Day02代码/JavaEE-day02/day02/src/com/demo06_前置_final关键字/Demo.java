package com.demo06_前置_final关键字;

/*
    final关键字
        最终的意思，可以修饰（类、方法、变量）
            1、修饰类：该类为最终类，不能被继承
            2、修饰方法：该方法为最终方法，不能被重写
            3、修饰变量：变量值就不能改变了
                3.1、成员变量：声明时完赋值，或者在构造结束之前完成赋值
                3.2、局部变量：该变量只能被赋值一次
                3.3、基本类型变量：变量记录的数据值不能被改变
                3.4、引用类型变量：变量记录的地址不能被改变，但是地址中的内容可以改变
 */

// TODO: 能够说出 final修饰类的特点
// TODO: 能够说出 final修饰方法的特点
// TODO: 能够说出 final修饰变量的特点

public class Demo {
    //3、修饰变量
    //3.1、成员变量：声明时完成赋值，或者在构造结束之前完成赋值
    //final int age = 10;
    final int age;

    public Demo(){
        age = 10;
    }

    public static void main(String[] args) {
        //3.2、局部变量：该变量只能被赋值一次
        final int age = 18;
        //age = 20; //报错，不能二次赋值

        //3.4、引用类型变量：变量记录的地址不能被改变，但是地址中的内容可以改变
        final Student stu = new Student("吴彦祖",18);
        //stu = new Student("蔡依林",20); //变量记录的地址不能被改变

        //但是地址中的内容可以改变
        stu.setName("蔡依林");
        stu.setAge(19);
        System.out.println(stu.getName()); //蔡依林
        System.out.println(stu.getAge()); //19

    }
}

//1、final修饰类：该类为最终类，不能被继承
/*final*/ class Fu{

    //2、修饰方法：该方法为最终方法，不能被重写
    public /*final*/ void test(){
        System.out.println("fu..test..");
    }
}

class Zi extends Fu{ //报错
    @Override
    public void test(){
        System.out.println("zi..test..");
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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