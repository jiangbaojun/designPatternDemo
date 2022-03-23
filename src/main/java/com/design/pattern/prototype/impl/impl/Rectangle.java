package com.design.pattern.prototype.impl.impl;

import com.design.pattern.prototype.impl.Shape;

public class Rectangle extends Shape {
 
   public Rectangle(){
     type = "Rectangle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
