package com.demo01_继承_子类构造器特点;

/*
    子类构造器特点
        子类的全部构造器，都会先调用父类的构造器，再执行自己

    子类构造器是如何实现调用父类构造器的
        子类全部构造器第一行代码，默认是super()，调用父类的空参构造器
        如果父类没有空参构造，那么就需要我们在子类构造器第一行，手动调用父类的带参构造
 */

// TODO: 能够说出 继承后子类构造器的特点

public class Demo {
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi("吴彦祖");
    }
}

class Fu{

    //要求类中必须提供一个空参构造
    public Fu(String name){
        System.out.println("父类的带参构造..");
    }

}

class Zi extends Fu{
    public Zi(){
        //super();
        super("吴彦祖");
        System.out.println("子类的空参构造..");
    }

    public Zi(String name){
        //super();
        super(name);
        System.out.println("子类的带参构造..");
    }
}
