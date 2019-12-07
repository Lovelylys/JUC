package com.atguigu.juc;

/**
 * @author abs
 * @Date 2019/10/25 - 0:01
 */
public class Test {
    public static Dog dog = new Dog();
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1.dog == test2.dog);
    }
}
class Dog{
    private String name;
}
