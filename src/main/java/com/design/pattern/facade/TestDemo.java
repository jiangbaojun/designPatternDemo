package com.design.pattern.facade;

/**
 * 外观模式（Facade Pattern），也叫门面模式
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 */
public class TestDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
   }
}
