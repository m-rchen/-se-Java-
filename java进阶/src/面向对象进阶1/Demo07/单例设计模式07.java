package 面向对象进阶1.Demo07;
//设计模式
//是一个问题有的n中解法,其中肯定有一种解法是最优的,这个最优都是被前人总结出来的,称之为设计模式
//常见设计模式有20多种,对应20多种软件开发中会遇见的问题


//单例设计模式:确保一个类只有一个对象
//写法:把类的构造器进行私有
//定义一个类变量记住类的一个对象
//定义一个类方法 ,返回对象
//那些地方用到了单例设计模式?任务管理器 Runtime


//饱汉式单例
public class 单例设计模式07 {
    public static void main(String[] args) {
        System.out.println(shcool.getshcool());
        System.out.println(shcool.getshcool());
        System.out.println(shcool.getshcool());
    }

}
class shcool{
    //1.将空参构造私有
    public shcool() {
    }

    //2.定义一个类变量记录一个创建好的对象
    private static shcool s=new shcool();

    //3.定义一个类方法,返回唯一的类对象
    public static shcool getshcool(){
        return s;
    }
}
