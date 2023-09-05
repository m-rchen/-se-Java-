package com.demo07_前置_常量;

/*
    常量
        使用了static final修饰的成员变量称为常量
        通常为了记录系统的配置信息等数据

    常量命名规范
        单词全部大写，如果有多个使用_隔开

    常量记录信息的好处
        提高了代码的阅读性，维护性
        程序编译后，常量会被"宏替换"，出现常量的地方都会被替换成字面量，保证使用常量和使用字面量的性能一致
        将class文件拖入idea查看编译后的情况（或者使用反编译工具）
 */

// TODO: 能够说出 常量的定义要求以及常量的作用

public class Demo {
    public static void main(String[] args) {
        //需求：打印10次黑马程序员 -> 使用常量
        //需求：修改所有黑马程序员，变成传智教育 -> 还用不用一个一个的修改了?
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);
        System.out.println(Constant.SCHOOL_NAME);

        //常量：提高了代码的阅读性，维护性
        //程序编译后，常量会被"宏替换"，出现常量的地方都会被替换成字面量，保证使用常量和使用字面量的性能一致
        //反编译：将class文件直接拖入idea；也可以使用反编译工具
    }
}

class Constant {
    //单词全部大写，如果有多个使用_隔开
    //使用了static final修饰的成员变量称为常量
    static final String SCHOOL_NAME = "传智教育";
}