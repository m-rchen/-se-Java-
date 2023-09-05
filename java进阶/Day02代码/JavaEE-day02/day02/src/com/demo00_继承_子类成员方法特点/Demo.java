package com.demo00_继承_子类成员方法特点;


/*
    继承中成员变量和成员方法访问特点
        在子类方法中访问其他成员，是依照就近原则的

    如果子父类中，出现了重名的成员，会优先使用子类的，如果此时一定要在子类中使用父类的怎么办
        可以通过super关键字指定访问父类的成员（super.父类成员变量、父类成员方法）
 */

// TODO: 能够说出 继承后子类访问方法、变量的特点

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.test();
    }
}

class Fu{
    //父类成员
    int num = 30;
}

class Zi extends Fu{
    //子类成员
    int num = 20;

    public void test(){
        //子类局部
        int num = 10;

        System.out.println(num); //子类局部 10

        //需求：打印num结果是20
        System.out.println(this.num); //子类成员 20

        //需求：打印num结果是30
        System.out.println(super.num); //30
    }
}

