package com.javashitang.creational.singleton.method5;

/**
 * @author lilimin
 * @since 2020-09-20
 */
// code8
public enum Singleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("单例对象的一个方法");
    }

    public static void main(String[] args) {
        Singleton.INSTANCE.doSomething();
    }
}
