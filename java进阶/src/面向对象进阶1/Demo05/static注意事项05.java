package 面向对象进阶1.Demo05;

//使用类方法'实例方法时的几点注意事项
//类方法中可以直接访问类的成员,不可以直接访问实例成员
//实例方法中既可以访问类成员,也可以直接访问实例成员
//实例方法中可以出现this关键字,类方法中不可以出现this关键字的

//结论
//1.静态的只能访问静态的
//2.静态方法中没有this关键字

public class static注意事项05 {
    static String name;
    double score;

    //类方法
    public static void printworld(){
        //类方法中可以直接访问类的成员,可以省略类名不写
        name="黑马";
        printworld2();
        //System.out.println(score); //类方法中访问实例成员会报错
       // System.out.println(this); //类方法中不能出现this关键字
    }
    public static void printworld2(){

    }

    //实例方法
    public void printpass(){
        //实例方法中既可以访问类成员,也可以直接访问实例成员
        name="黑马";
        printworld2();

        //实例方法也是可以访问实例方法的,实例方法名前默认this关键字
          printpass0();

        System.out.println(this);
    }
    public void printpass0(){

    }

}
