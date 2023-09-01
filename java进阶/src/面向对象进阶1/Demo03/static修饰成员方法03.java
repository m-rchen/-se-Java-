package 面向对象进阶1.Demo03;

import javax.swing.text.Style;

public class static修饰成员方法03 {
    //成员方法的分类
    //类方法 :有static修饰的成员方法,属于类,可以直接用类名访问,也可以用对象访问
    //类方法(静态方法)



    //实例方法:无static修饰,属于每个对象的,只能用对象访问
    //实例方法(对象的方法)


    public static void main(String[] args) {
        //类方法,可以使用类名来提取类方法
        Stu.Test();

        //也可以用对象,提取类方法(不推荐)
        Stu s=new Stu();
        s.Test();

        //对象.实例方法
        s.Test01("张三");
       // Stu.Test01  //报错,不能使用类名去调用实例方法

    }
}
class Stu{

    public static void Test(){

        System.out.println("hello world");
    }

    public void Test01(String name){

    }

}
