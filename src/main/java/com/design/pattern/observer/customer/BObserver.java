package com.design.pattern.observer.customer;

/**
 * 观察者B
 */
public class BObserver extends Observer{

   public BObserver(Observable observable) {
      super(observable);
   }

   @Override
   public void update(Observable observable, Object data) {
      System.out.println( "BObserver: "+ data);
   }
}