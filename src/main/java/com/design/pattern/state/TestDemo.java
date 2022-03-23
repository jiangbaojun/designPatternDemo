package com.design.pattern.state;

import com.design.pattern.state.basic.Context;
import com.design.pattern.state.basic.impl.StartState;
import com.design.pattern.state.basic.impl.StopState;

/**
 * 状态模式
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 *
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 主要解决：对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 */
public class TestDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);


      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}
