package 面向对象进阶1.Demo12;
//什么是方法重写
    /*当子类觉得父类中的某个方法不好用,或者无法满足自己的需求时,子类可以重写一个方法名古城
    参数列表一样的方法,去覆盖父类的这个方法,这就是重写*/
//注意:重写后,访问的方法,java会遵循就近原则

//方法重写的注意事项
//1.使用@override,可以校验重写是否正确,同时可读性号
//2.子类重写父类方法时,访问权限必须大于或者等于父类该方法的权限(public>protected>缺省)
//3.重写的方法返回值类型,必须与被重写方法的返回值类型一样,或者范围更小
//4.私有方法,静态方法不能被重写,如果重写是会报错的


public class 继承方法的重写12 {
    public static void main(String[] args) {
    Zi z=new Zi();
    z.print1();

    }

}
class Fu{
    public void print1(){
        System.out.println("111");
    }
    public void print2(){
        System.out.println("222");
    }
}

class Zi extends Fu{

    public void print1() {

        System.out.println("666");
    }


    public void print2() {

        System.out.println("888");
    }
}
