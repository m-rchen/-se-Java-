package 面向对象进阶1.Demo07;
//单例设计模式:确保一个类只有一个对象
//写法:把类的构造器进行私有
//定义一个类变量记住类的一个对象，不做初始化
//定义一个类方法,保证返回的是唯一的类对象

public class 懒汉式单例 {
    public static void main(String[] args) {
        Run r=Run.getRun(); //第一次拿对象
        Run r2=Run.getRun();
        System.out.println(r==r2);
    }

}
class Run{
    //1.把类的构造器进行私有
    public Run() {
    }

    //2.定义一个类变量,用于存储这个类的一个对象
    private static Run s;

    //3.定义一个类方法,这个方法要保证第一次调用时才创建一个对象,后面调用时都会用这同一个对象返回
    public static Run getRun(){
        if (s==null){
            System.out.println("第一次创建对象");
        s=new Run();
        }
        return s;
    }
}