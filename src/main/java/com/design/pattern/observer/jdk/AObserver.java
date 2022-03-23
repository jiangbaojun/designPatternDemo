package com.design.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者A
 */
public class AObserver implements Observer {
    
    public AObserver(ServerManager sm) {
        sm.addObserver(this);   //注册加入观察者
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("AObserver receive:Data has changed to "+((ServerManager) arg0).getData());
    }

}