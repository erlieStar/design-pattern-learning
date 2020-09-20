package com.javashitang.observer.method2;

import java.util.Observable;
import java.util.Observer;

public class WeChatClient implements Observer {

    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public void update(Observable o, Object arg) {
        NewArticleEvent event = (NewArticleEvent) arg;
        System.out.println(username + ": " + event.getAuthorName() + " 发了一篇文章 " + event.getAuthorName());
    }
}
