package com.design.pattern.strategy;

import com.design.pattern.strategy.basic.impl.OperationAdd;
import com.design.pattern.strategy.basic.impl.OperationMultiply;
import com.design.pattern.strategy.basic.impl.OperationSubtract;

/**
 * 策略模式（Strategy Pattern）
 * 一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 */
public class TestDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubtract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}
