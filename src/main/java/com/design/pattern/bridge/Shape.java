package com.design.pattern.bridge;

import com.design.pattern.bridge.basic.DrawAPI;

/**
 * 桥接抽象类，包含需要解耦的原始接口DrawAPI
 * 目的是要有DrawAPI的draw方法，但是不是实现DrawAPI，而是将DrawAPI作为属性
 * 通过构造方法，将原始接口DrawAPI传入
 */
public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }

   /**
    * 也可以写成protected方法，添加公共实现逻辑代码
    */
   public abstract void draw();  
}