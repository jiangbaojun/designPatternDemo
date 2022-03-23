package com.design.pattern.builder.item;


import com.design.pattern.builder.packing.Packing;
import com.design.pattern.builder.packing.Wrapper;

/**
 * 抽象汉堡类目
 * @author jiangbaojun
 * @date 2021/1/14 14:54
 * @version v1.0
 */
public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
}
