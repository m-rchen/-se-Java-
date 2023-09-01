package 面向对象进阶1.Demo09;

public class 使用继承的好处09 {
    //继承的好处:减少重复代码的编写


    //案例1.设计父类person
    public static void main(String[] args) {
    Teacher t=new Teacher();
    t.setAge(18);
    t.setName("张三");
    t.setSkill("教书");
        System.out.println(t.getSkill());
        System.out.println(t.getAge());
        System.out.println(t.getName());

        Student s = new Student();
        s.setName("吴彦祖");
        s.setAge(18);
        s.setScore(100);
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getScore());
    }
}

class Person{
    private int age;
    private String name;

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
}

class Teacher extends Person{

    private String skill;




    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


}


class Student extends Person{

    private double score;



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}