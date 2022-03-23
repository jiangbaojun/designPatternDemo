package com.design.pattern.bridge;

import com.design.pattern.bridge.basic.DrawAPI;

/**
 * 桥接抽象类的实现（继承）
 */
public class Circle extends Shape {
   private int x, y, radius;
 
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }

   /**
    * 调用桥接类的draw方法，实际上是调用了原始接口的drawCircle方法。
    * 不将原始接口DrawAPI和桥接类Circle做绑定，实现解耦目的
    */
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}