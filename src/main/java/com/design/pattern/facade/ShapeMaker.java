package com.design.pattern.facade;

import com.design.pattern.facade.basic.Shape;
import com.design.pattern.facade.basic.impl.Circle;
import com.design.pattern.facade.basic.impl.Rectangle;
import com.design.pattern.facade.basic.impl.Square;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
 
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }
 
   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}