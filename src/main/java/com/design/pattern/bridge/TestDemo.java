package com.design.pattern.bridge;

import com.design.pattern.bridge.basic.impl.GreenCircle;
import com.design.pattern.bridge.basic.impl.RedCircle;

/**
 * 桥接模式
 * 主要目的是实现解耦，实现方式是将需要解耦的接口作为属性（而不是实现或继承），包装在桥接抽象里面，在桥接抽象里面调用相应方法
 * 和适配器模式的区别：适配器模式为了扩展功能，桥接模式为了解耦
 */
public class TestDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}