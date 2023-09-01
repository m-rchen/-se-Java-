package 面向对象进阶1.Demo10;
//权限修饰符
//就是用来限制类中的成员(成员变量,成员方法,构造器,代码块....)能够被访问的范围
//权限修饰符有几种?各自的作用是什么?
//1.private 只能本类
//2.缺省  本类,同一个包中
//3.protected  本类,同一个包中的类,子孙类中
//4.public  任意位置
public class 继承的权限修饰符10 {
    public static void main(String[] args) {
        Fu f=new Fu();
        //f.a(); 私有不能被访问

    }
}

class Fu{
    //1.私有:只能在本类中访问
    private void a(){
        System.out.println("--私有--");
    }

    //2.缺省:本类,同一个包下的类
    void b(){
        System.out.println("--缺省--");
    }

    //3.protected:本类,同一个包下的类,任意包下的子类
    protected void c(){
        System.out.println("--protected--");
    }

    //4.public:本类,同一个包下的类,任意包下的子类,任意包下的任意类
    public void d(){
        System.out.println("--public--");
    }

    public void test(){
        a();
        b();
        c();
        d();
        //都可以访问
    }
}
