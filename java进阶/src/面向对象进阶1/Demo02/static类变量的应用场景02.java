package 面向对象进阶1.Demo02;

public class static类变量的应用场景02 {
    //在开发中,如果某个数据只需要一份,且希望能被共享(访问,修改)则该数据可以定义为类变量来记住

    //成员变量有2种   1.类变量:数据只需要一份,且需要被共享是(访问,修改)
    //2.实例变量:每个对象都要有一份,数据不同(如:name ,score,age)

    //访问自己类中的类变量,是否可以省略类名不写?
    // 可以的,  注意:在某个类中访问其他类的类变量,必须带类名访问

    //要求系统启动后,能记住自己创建了多少个用户对象

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User();
        User u3=new User();
        User u4=new User("张三",26);

        System.out.println(User.count);
    }
}
//用户类
class User{
    private  String name;
    private  int    age;
    //创建一个count记录次数
    static int count;

    public User() {
        //计数
        //本类中访问,可以不在类名
        count++;
    }
    public User(String name,int age){
        this.age=age;
        this.name=name;
        count++;

    }
}
