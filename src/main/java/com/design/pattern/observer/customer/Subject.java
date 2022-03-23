package com.design.pattern.observer.customer;

/**
 * 被观察者
 * @author jiangbaojun
 * @workid 1861
 * @date 2021/1/13 10:13
 * @version v1.0
 */
public class Subject extends Observable{


    private Integer data;

    public Integer getState() {
        return data;
    }

    /**
     * 当设置了data，就通知观察者
     */
    public void setState(Integer data) {
        this.data = data;
        notifyAllObservers(data);
    }



}