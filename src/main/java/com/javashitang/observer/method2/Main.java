package com.javashitang.observer.method2;

public class Main {

    public static void main(String[] args) {
        WeChatServer weChatServer = new WeChatServer("Java识堂");
        WeChatClient user1 = new WeChatClient("张三");
        WeChatClient user2 = new WeChatClient("李四");
        weChatServer.addObserver(user1);
        weChatServer.addObserver(user2);
        weChatServer.publishArticle("《五分钟读懂观察者模式》");
    }
}
