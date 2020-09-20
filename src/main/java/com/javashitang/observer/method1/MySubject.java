package com.javashitang.observer.method1;

public interface MySubject {

    void registerObserver(MyObserver o);

    void removeObserver(MyObserver o);

    void notifyObserver();
}
