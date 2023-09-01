package 面向对象进阶1.Demo06;
//代码块的概述
//代码块是类的5大成分致以(成员变量,构造器,方法,代码块,内部类)
//代码块分两种
//静态代码块:1.格式static{}
//2.特点:类加载时自动执行,由于类只会加载一次,所以静态代码块也只会执行一次
//作用:3.完成类的初始化,例如:对类变量的初始化赋值
//实例代码块
//1.格式{}
//2.特点:每次创建对象时,执行实例代码块,并在构造器前执行
//3.作用:和构造器一样,都是用来完成对象的初始化


public class 类的成分_代码块 {
    public static void main(String[] args) {
        //加载shool类
        System.out.println(shool.name);
        System.out.println(shool.name);

        shool s1=new shool();
        System.out.println();
    }

}
class shool{
    //静态变量
    static  String name;
    //实例变量
    private  int age;
    //静态代码块
    static {
        //静态代码块只会运行一次
        System.out.println("这是静态代码块");
        name="张三";
    }
    //
    {
        System.out.println("这是实例代码块");
    }


}