package com.design.pattern.observer.customer;

import java.util.Vector;

/**
 * 被观察者抽象
 */
public abstract class Observable {

    private Vector<Observer> observers = new Vector<>();

    /**
     * 添加观察者
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObservers(Object data) {
        for (Observer observer : observers) {
            observer.update(this, data);
        }
    }
}
