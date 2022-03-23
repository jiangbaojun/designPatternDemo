package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.color.Color;
import com.design.pattern.abstractfactory.shape.Circle;
import com.design.pattern.abstractfactory.shape.Rectangle;
import com.design.pattern.abstractfactory.shape.Shape;
import com.design.pattern.abstractfactory.shape.Square;


public class ShapeFactory extends AbstractFactory {

   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}