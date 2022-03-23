package com.design.pattern.builder.packing;

/**
 * 瓶装
 * @author jiangbaojun
 * @date 2021/1/14 14:51
 * @version v1.0
 */
public class Bottle implements Packing {
 
   @Override
   public String pack() {
      return "Bottle";
   }
}