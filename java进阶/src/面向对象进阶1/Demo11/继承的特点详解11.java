package 面向对象进阶1.Demo11;

public class 继承的特点详解11 {
    //java是单继承的,java中的类不支持多继承,但是支持多层继承

    //object类是java所有类的祖宗类,我们写的任何一个类,其实都是object的子类或者子孙类
    //java中的类都直接或者间接的继承object类
    public static void main(String[] args) {
        Coder c = new Coder("9527", "小李", 26);
        c.work();

        Manager m = new Manager("001", "老张", 38, 20000);
        m.work();
    }
}

class Manager extends person {
    private int bonus;

    public Manager() {
    }

    public Manager(String id, String name, int age, int bonus) {
        super(age, name,id);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的项目经理" + getName() + "在和客户谈需求，项目奖金" + bonus + "但是" + getAge() + "岁还没结婚");
    }
}

class Coder extends person{
    public Coder() {
    }
    public Coder(String id, String name, int age) {
        super(age,name,id);
    }

    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的程序员" + getName() + "根据需求完成代码，" + getAge() + "岁就月薪过万了");
    }

}

class person{
    private int age;
    private String name;
    private String id;

    public person() {
    }

    public person(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work() {
        System.out.println("人都要工作");
    }
}