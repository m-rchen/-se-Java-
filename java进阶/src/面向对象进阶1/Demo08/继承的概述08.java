package 面向对象进阶1.Demo08;
//继承
//java中提供了一个关键字extends,用这个关键字,可以让一个类和另一个类建立起父子关系
//public classb B extends A{
//
// }
//A是父类  B是子类

//继承的特点
//子类能继承父类的非私有成员(成员变量,成员方法)

//继承后对象创建
//子类的对象是由子类,父类共同完成
//子类对象实际上是由子父类这两张设计图共同创建出来的
public class 继承的概述08 {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.i);
        //System.out.println(b.j); 由于j是私有的,不能被继承,所以报错
    }

}
class A{

    //公开成员
    public int i;
    public void print1(){
        System.out.println("--print1--");
    }

    //私有成员
    private int j;
    private void print2(){
        System.out.println("--print2--");
    }
}

class B extends A{
    //子类能继承父类的非私有成员(成员变量,成员方法)
    public void print3(){
        //B类继承A类的公开
        System.out.println(i);
        print1();

        //B类不能继承A类的私有
        //System.out.println(j);  //报错
        //print2();  //报错
    }
}
