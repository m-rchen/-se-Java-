package com.demo11_接口_概述;

/*
    接口概述
        Java提供了一个关键字interface
        用这个关键字我们可以定义出一个特殊的结构：接口

    接口定义格式
        public interface 接口名{
            //成员变量（默认是常量，默认被public static final修饰）
            //成员方法（默认是抽象方法，默认被public abstract修饰）
            //注意：接口中不能有构造方法、代码块
        }

    注意事项
        1、接口不能直接创建对象
        2、接口是用来被类实现的（implements），实现接口的类称为实现类，必须重写接口中所有抽象方法（要么将自己抽象，但是无意义）
        3、一个类可以实现多个接口，之间用逗号隔开
 */

// TODO: 能够说出 什么是接口，以及接口的特点

public class Demo {
    public static void main(String[] args) {
        //1、接口不能直接创建对象
        //Inter i = new Inter();

        //创建实现类对象，实现接口的方法
        InterImpl ii = new InterImpl();
        ii.show();
        ii.testA();
        ii.testB();

        System.out.println("-----------------");

        //接口多态
        Inter i = new InterImpl();
        i.show(); //实现类的show..
        InterA i1 = new InterImpl();
        i1.testA();
        InterB i2 = new InterImpl();
        i2.testB();
    }
}

//2、接口是用来被类实现的（implements），实现接口的类称为实现类，必须重写接口中所有抽象方法（要么将自己抽象，但是无意义）
//3、一个类可以实现多个接口，之间用逗号隔开
/*abstract*/ class InterImpl implements Inter, InterA, InterB {
    @Override
    public void show() {
        System.out.println("实现类的show..");
    }

    @Override
    public void testA() {
        System.out.println("实现类的testA..");
    }

    @Override
    public void testB() {
        System.out.println("实现类的testB..");
    }
}

interface InterB {
    void testB();
}
interface InterA {
    void testA();
}
interface Inter {
    //成员变量（默认是常量，默认被public static final修饰）
    public static final int AGE = 18;
    //成员方法（默认是抽象方法，默认被public abstract修饰）
    public abstract void show();
    //注意：接口中不能有构造方法、代码块
}



