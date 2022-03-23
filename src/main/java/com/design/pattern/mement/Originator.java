package com.design.pattern.mement;

import com.design.pattern.mement.basic.Moment;

/**
 * 获取、保存状态操作
 */
public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Moment saveStateToMemento(){
      return new Moment(state);
   }

   public void getStateFromMemento(Moment moment){
      state = moment.getState();
   }
}
