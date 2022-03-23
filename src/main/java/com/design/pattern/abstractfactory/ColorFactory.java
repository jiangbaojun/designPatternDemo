package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.color.Blue;
import com.design.pattern.abstractfactory.color.Color;
import com.design.pattern.abstractfactory.color.Green;
import com.design.pattern.abstractfactory.color.Red;
import com.design.pattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}