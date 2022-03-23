package com.design.pattern.decorator;

import com.design.pattern.decorator.basic.Shape;

/**
 * 装饰器类，装饰shape
 * 含有一个原始的shape实例，同时实现shape，在复写的draw中调用原始的shape实例功能，然后扩展装饰器功能
 */
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
 
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }
 
   public void draw(){
      decoratedShape.draw();
   }  
}