package com.demo10_抽象类_模板方法设计模式;

/*
    设计模式
        一个特定问题的最优解（前人总结下来的套路）

    模板方法设计模式
        主要解决方法中存在重复代码的问题

    使用思路
        1、定义一个模板类（抽象类），提供模板方法
        2、模板方法中，需要让子类自己实现的地方，定义为抽象方法，其他固定内容写死
        3、子类只需要继承模板类，重写抽象方法即可完成要完成的功能

    多学一招：建议使用final关键字修饰模板方法
        模板方法是给对象直接使用的，不能被子类重写；一旦子类重写了模板方法，模板方法就失效了

    Java中的模板方法设计模式
        DateFormat类的format方法
 */

// TODO: 能够理解 模板方法模式的作用，并能说出其实现思路

public class TestSing {
    public static void main(String[] args) {
        Tom t = new Tom();
        t.sing();

        Jerry j = new Jerry();
        j.sing();
    }
}

class Jerry extends Game{
    @Override
    public void doSing() {
        System.out.println("星星点灯，照亮我的家门~");
    }
}

//3、子类只需要继承模板类，重写抽象方法即可完成要完成的功能
class Tom extends Game{
    @Override
    public void doSing() {
        System.out.println("我是一只小小小小鸟，怎么飞也飞也飞也飞不高~");
    }
}

//1、定义一个模板类（抽象类），提供模板方法
abstract class Game {
    //2、模板方法中，需要让子类自己实现的地方，定义为抽象方法，其他固定内容写死
    //模板方法不想（修改）被子类重写，可以使用final修饰
    public final void sing() {
        System.out.println("== 选手做自我介绍 ==");
        //唱歌什么让子类自己实现
        doSing();
        System.out.println("== 谢谢大家 ==");
    }
    //抽象方法
    public abstract void doSing();
}
