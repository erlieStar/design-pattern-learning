package com.javashitang.observer;

public class WeChatClient implements MyObserver {

    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public void update(String authorName, String articleName) {
        System.out.println(username + ": " + authorName + " 发了一篇文章 " + articleName);
    }
}
