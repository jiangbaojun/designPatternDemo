package com.design.pattern.observer.customer;

/**
 * 观察者A
 */
public class AObserver extends Observer{

   public AObserver(Observable observable) {
      super(observable);
   }

   @Override
   public void update(Observable observable, Object data) {
     System.out.println( "AObserver: "+ data);
   }
}