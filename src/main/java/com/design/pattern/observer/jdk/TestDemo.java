package com.design.pattern.observer.jdk;

/**
 * JDK自带观察者模式
 * 如果有多个观察者，那么是同步调用的，一个完成，再调用另一个。如果某个观察者出错，后面的观察者不再调用
 */
public class TestDemo {
    public static void main(String[] args) {
        ServerManager sm = new ServerManager();
        AObserver a    = new AObserver(sm);
        BObserver b = new BObserver(sm);
        sm.setData(5);
        sm.deleteObserver(a);   //注销观察者，以后被观察者有数据变化就不再通知这个已注销的观察者
        sm.setData(10);
    }

}