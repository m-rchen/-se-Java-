package com.demo05_多态_好处和弊端;

/*
    多态的好处
        好处1：在多态的形式下，等号右边的对象是解耦合的，更便于维护和扩展
        好处2：在定义方法时，使用父类型作为形参，那么该方法就可以接收，该父类型的所有子类对象

    多态的弊端
        不能直接使用子类特有的功能

    如果非要使用子类特有的功能呢?
        可以使用强转

    多态中的转型
        子到父（自动转换）：也称为"向上转型"，父类引用指向子类对象
            Person p = new Student();
        父到子（强制转换）：也称为"向下转型"，父类引用转为子类对象
            Student s = (Student) p;

    强转可能存在风险
        如果转为父类引用记录的真实子类对象，那么不会报错
        否则会报ClassCastException

    如何避免这个风险
        使用instanceof关键字，它可以判断左边的变量是不是右边的类型，返回值类型布尔
 */

// TODO: 能够说出 多态的概念和好处
// TODO: 能够说出 多态下类型转换需要注意什么问题，如何解决

public class Demo {
    public static void main(String[] args) {

        /*
            多态看运行结果
                1、变量：编译看左，运行看左（变量不涉及多态）
                2、方法：编译看左，运行看右（子类存在方法重写）
         */

        //成功调用useAnimal方法
        useAnimal(new Cat());
        useAnimal(new Dog());
    }

    //【1】好处：在定义方法时，使用父类型作为形参，那么该方法就可以接收，该父类型的所有子类对象
    public static void useAnimal(Animal a){ // = new Dog();

        //【2】行为多态，运行执行子类重写后的方法
        a.eat();

        //【3】多态的弊端：不能直接使用子类特有的功能
        //a.lookDoor();

        //【4】如果非要使用子类特有的功能呢? 可以使用强转（可能出问题的） -> 老老实实的创建子类对象！
//        Dog d = (Dog) a; //ClassCastException
//        d.lookDoor();

        //【5】如何避免这个风险
        //使用instanceof关键字，它可以判断左边的变量是不是右边的类型，返回值类型布尔
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookDoor();
        }
    }
}

class Animal{
    //这个方法，就是等着子类来重写的
    public void eat(){
        System.out.println("动物要吃饭..");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉..");
    }

    //子类特有的功能
    public void lookDoor(){
        System.out.println("狗看门..");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃猫条..");
    }
}






