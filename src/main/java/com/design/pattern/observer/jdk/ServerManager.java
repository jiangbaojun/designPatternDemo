package com.design.pattern.observer.jdk;

import java.util.Observable;

/**
 * 被观察者
 */
public class ServerManager extends Observable {
    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int i) {
        if (this.data != i) {
            this.data = i;
            setChanged();
        }
        notifyObservers(123);  //只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。  } }
    }

}