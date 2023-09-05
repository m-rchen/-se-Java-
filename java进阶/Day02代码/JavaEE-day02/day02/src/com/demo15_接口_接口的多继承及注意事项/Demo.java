package com.demo15_接口_接口的多继承及注意事项;
/*
    类和接口的关系总结
        1、类和类：继承关系，Java只支持单继承，不支持多继承
        2、类和接口：实现关系，可以单实现也可以多实现，一个类可以在继承另一个类的同时实现多个接口
        3、接口和接口：继承关系，可以多单继承也可以多继承（便于类去实现）

    接口使用注意事项
        1、一个接口继承多个接口，如果多个接口中存在方法声明冲突，则此时不支持多继承
        2、一个类实现多个接口，如果多个接口中出现方法声明冲突，则此时不支持多实现（道理同上）
        3、一个类实现多个接口，如果多个接口中有同名的默认方法，此时实现类重写该方法即可
        4、一个类继承父类的同时实现接口，接口中有和父类中同名的默认方法，实现类优先使用父类的
 */

// TODO: 能够说出 接口与接口的关系

public class Demo {
    public static void main(String[] args) {
        new Zi().study(); //亲爹说,学习java..
    }
}

//4、一个类继承父类的同时实现接口，接口中有和父类中同名的默认方法，实现类优先使用父类的
class Fu{
    public void study(){
        System.out.println("亲爹说,学习java..");
    }
}
interface GanDie{
    default void study(){
        System.out.println("干爹说,学习前端..");
    }
}
class Zi extends Fu implements GanDie{

}

//3、一个类实现多个接口，如果多个接口中有同名的默认方法，此时实现类重写该方法即可
interface Inter1{
    default void show(){
        System.out.println("Inter1的show..");
    }
}
interface Inter2{
    default void show(){
        System.out.println("Inter2的show..");
    }
}
class InterImpl implements Inter1,Inter2{
    @Override
    public void show() {
        //谁的都不用，用自己的
        System.out.println("InterImpl自己show..");
    }
}

//2、一个类实现多个接口，如果多个接口中出现方法声明冲突，则此时不支持多实现（道理同上）
//class InterImpl implements InterA,InterB{
//    @Override
//    public String method() { //重写后返回值写String还是void的? 冲突!
//        return null;
//    }
//}


//1、一个接口继承多个接口，如果多个接口中存在方法声明冲突，则此时不支持多继承
interface InterA{
    String method();
}
interface InterB{
    void method();
}
//interface InterC extends InterA,InterB{
//    @Override
//    default String method() { //重写后返回值写String还是void的? 冲突!
//        return null;
//    }
//}

