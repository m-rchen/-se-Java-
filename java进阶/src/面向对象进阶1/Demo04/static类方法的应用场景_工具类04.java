package 面向对象进阶1.Demo04;
//类方法的常见应用场景:类方法最常见的应用场景是做工具类
//工具类是什么?
//  工具类中的方法都是一些类方法,每个方法都是用来完成一个功能的,工具类是给开发人员共同使用的
//使用类方法来设计工具类有啥好处
//提高代码复用:调用方便,提高开发效率,能节省内存
//实例方法需要创建对象,会浪费内存
//工具类定义的要求:类名见名致以,空参制造私有,
import java.util.Random;

public class static类方法的应用场景_工具类04 {

    public static void main(String[] args) {
        //调用类方法
        System.out.println(yanzhengma.getCode(6));
    }

}
class yanzhengma{
    //构造器私有化
    private yanzhengma(){

    }

     static String getCode(int lenght) {

        //需求,求俩数最大值
        //工具类:Math
/*        int a=10;
        int b=20;
        int max = Math.max(10, 20);*/

        //获取一个长度为4的验证码
        Random r=new Random();
        String s="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM123456789";
        //循环4次
        String code="";
        for (int i = 1; i <=lenght; i++) {
            int index=r.nextInt(s.length());
            char ch=s.charAt(index);
            code+=ch;

        }
        return code;

    }
}

