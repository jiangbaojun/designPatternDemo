package com.design.pattern.builder.item.impl;

import com.design.pattern.builder.item.ColdDrink;
/**
 * 可口冷饮
 * 具体实现
 * @author jiangbaojun
 * @date 2021/1/14 14:57
 * @version v1.0
 */
public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}