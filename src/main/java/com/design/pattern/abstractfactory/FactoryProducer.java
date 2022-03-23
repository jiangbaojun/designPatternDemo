package com.design.pattern.abstractfactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
   public static <T> T getFactory(Class<T> clazz){
      if(clazz==ShapeFactory.class){
         return (T) new ShapeFactory();
      } else if(clazz==ColorFactory.class){
         return (T) new ColorFactory();
      }
      return null;
   }
}
