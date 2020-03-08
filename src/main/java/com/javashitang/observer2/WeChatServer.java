package com.javashitang.observer2;

import java.util.Observable;

public class WeChatServer extends Observable {

    private String authorName;
    private String articleName;

    public WeChatServer(String authorName) {
        this.authorName = authorName;
    }

    public void publishArticle(String articleName) {
        setChanged();
        this.articleName = articleName;
        notifyObservers(new NewArticleEvent(authorName, articleName));
    }
}
