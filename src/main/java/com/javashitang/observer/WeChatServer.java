package com.javashitang.observer;

import java.util.ArrayList;
import java.util.List;

public class WeChatServer implements MySubject {

    private List<MyObserver> myObservers;
    private String authorName;
    private String articleName;

    public WeChatServer(String authorName) {
        myObservers = new ArrayList<>();
        this.authorName = authorName;
    }

    public void publishArticle(String articleName) {
        this.articleName = articleName;
        notifyObserver();
    }

    @Override
    public void registerObserver(MyObserver o) {
        myObservers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        if (myObservers.contains(o)) {
            myObservers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        myObservers.forEach(item -> {
            item.update(authorName, articleName);
        });
    }
}
