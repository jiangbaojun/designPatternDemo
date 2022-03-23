package com.design.pattern.mement;

import com.design.pattern.mement.basic.Moment;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象历史状态
 */
public class CareTaker {
   private List<Moment> momentList = new ArrayList<Moment>();

   public void add(Moment state){
      momentList.add(state);
   }

   public Moment get(int index){
      return momentList.get(index);
   }
}
