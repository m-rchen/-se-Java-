package 面向对象进阶1.Demo01;
//补充知识:搞懂main方法
//main方法其实也是一个类方法
//1.main方法是啥方法?
//2.main方法咋就能直接跑起来?
//

public class main方法配置 {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
