package com.design.pattern.observer.customer;

public class TestDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      AObserver aObserver = new AObserver(subject);
      BObserver bObserver = new BObserver(subject);

      System.out.println("改变数据: 15");
      subject.setState(15);

      System.out.println("移除观察者B，然后改变数据: 10");
      subject.deleteObserver(bObserver);
      subject.setState(10);
   }
}