package com.design.pattern.decorator;

import com.design.pattern.decorator.basic.Circle;
import com.design.pattern.decorator.basic.Rectangle;
import com.design.pattern.decorator.basic.Shape;

/**
 * 装饰器模式（Decorator Pattern）
 * 向一个现有的对象添加新的功能，同时又不改变其结构
 * 它是作为现有的类的一个包装
 */
public class TestDemo {
   public static void main(String[] args) {
 
      Shape circle = new Circle();
      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
      //Shape redCircle = new RedShapeDecorator(new Circle());
      //Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
 
      System.out.println("\nCircle of red border");
      redCircle.draw();
 
      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}