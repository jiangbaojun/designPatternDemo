package com.design.pattern.facade.basic.impl;

import com.design.pattern.facade.basic.Shape;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}
