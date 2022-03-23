package com.design.pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
   //一种颜色的圆形，只创建并缓存一个对象。当需要该颜色的圆形对象时，直接获取就可。达到共享目的
   private static final HashMap<String, Shape> circleMap = new HashMap<>();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}
