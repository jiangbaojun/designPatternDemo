package com.design.pattern.observer.customer;

/**
 * 观察者抽象
 */
public abstract class Observer {

   public Observer(Observable observable){
      observable.addObserver(this);
   }

   /**观察更新事件*/
   public abstract void update(Observable observable, Object data);
}