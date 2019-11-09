package com.javashitang.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
        Video car = VideoFactory.getVideo("java");
        // 学习Java视频
        car.study();
    }
}
