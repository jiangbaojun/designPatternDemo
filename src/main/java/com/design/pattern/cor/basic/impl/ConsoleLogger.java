package com.design.pattern.cor.basic.impl;

import com.design.pattern.cor.basic.AbstractLogger;

public class
ConsoleLogger extends AbstractLogger {
 
   public ConsoleLogger(int level){
      this.level = level;
   }
 
   @Override
   protected void write(String message) {    
      System.out.println("Standard Console::Logger: " + message);
   }
}