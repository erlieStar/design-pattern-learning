package com.javashitang.observer;

public interface MySubject {

    void registerObserver(MyObserver o);

    void removeObserver(MyObserver o);

    void notifyObserver();
}
