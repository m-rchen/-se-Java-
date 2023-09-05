package com.demo14_接口_JDK8开始接口的优化;
/*
    JDK8对接口的更新
        1、默认方法：扩展接口功能且不影响实现类
            使用default修饰，默认被public修饰，有方法体和具体实现，可以但是不强制被实现类重写，只能通过实现类对象调用
        2、静态方法：方便调用
            使用static修饰，有方法体和具体实现，只能通过接口名调用
        3、私有方法：提高代码复用性
            使用private修饰，服务于接口内部，用来抽取相同的功能代码，JDK9开始支持
 */

// TODO: 能够理解 JDK8开始接口新增的方法，以及其访问机制

public class Demo {
    public static void main(String[] args) {
        //使用接口中的默认方法
        InterImpl ii = new InterImpl();
        ii.show1();
        ii.show2();

        //使用接口中的静态方法
        //Inter.method();
        //InterA.method();

        //使用接口中的私有方法
        //ii.test();
    }
}

class InterImpl implements Inter{
    @Override
    public void show1() {
        System.out.println("实现类重写后的show1方法...");
    }
}

interface InterA{
    static void method(){
        System.out.println("== InterA的静态方法 ==");
    }
}

interface Inter{
    /*
        1、默认方法：扩展接口功能且不影响实现类
            使用default修饰，默认被public修饰，有方法体和具体实现，可以但是不强制被实现类重写，只能通过实现类对象调用
     */
    public default void show1(){
        System.out.println("== 默认方法1 ==");
        //System.out.println("记录日志");
        log();
    }

    public default void show2(){
        System.out.println("== 默认方法2 ==");
        //System.out.println("记录日志");
        log();
    }

    /*
        2、静态方法：方便调用
            使用static修饰，有方法体和具体实现，只能通过接口名调用
     */
    static void method(){
        System.out.println("== 静态方法 ==");
    }

    /*
        3、私有方法：提高代码复用性
            使用private修饰，服务于接口内部，用来抽取相同的功能代码，JDK9开始支持
     */
    private void log(){
        System.out.println("记录日志");
    }
}

