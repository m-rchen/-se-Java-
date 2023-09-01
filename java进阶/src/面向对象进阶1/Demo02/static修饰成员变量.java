package 面向对象进阶1.Demo02;

//static  静态的意思,可以修饰成员变量,成员方法
//成员变量按照有无static修饰,分两种
//1.类变量 :有static修饰,属于类,在计算机中只有一份,会被类的全部对象共享
//2.实例变量(对象的变量):无static修饰,属于每个对象的,每个对象都有一份
public class static修饰成员变量 {
    public static void main(String[] args) {
        //类名.类变量
        Stduent.name="张三";

        //对象.类变量(不推荐)
        Stduent s=new Stduent();
        s.name="李四";

        Stduent s1=new Stduent();
        s1.name="王五";

        System.out.println(s.name);//王五
        System.out.println(Stduent.name);//王五

        //2.实例变量:属于每个对象的变量
        s.age=22;
        s1.age=20;
        System.out.println(s.age);//22
        System.out.println(s1.age);//20

        //用类名访问不了
        // System.out.println(Stduent.age);
    }



}
class  Stduent{
    //类变量,加上了static关键字修饰,就变成类变量
    static  String name;
    //实例变量(对象的变量),没有static关键字修饰
    int age;
}
