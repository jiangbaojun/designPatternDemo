package com.design.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者A
 */
public class BObserver implements Observer {
    
    public BObserver(ServerManager sm) {
        sm.addObserver(this);   //注册加入观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("BObserver receive:Data has changed to "+((ServerManager) o).getData());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}