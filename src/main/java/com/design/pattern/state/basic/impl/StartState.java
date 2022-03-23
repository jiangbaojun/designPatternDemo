package com.design.pattern.state.basic.impl;

import com.design.pattern.state.basic.Context;
import com.design.pattern.state.basic.State;

public class StartState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);
   }

   public String toString(){
      return "Start State";
   }
}
