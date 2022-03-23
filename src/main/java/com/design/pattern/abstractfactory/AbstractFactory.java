package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.color.Color;
import com.design.pattern.abstractfactory.shape.Shape;

/**
 * 抽象工厂
 * @author jiangbaojun
 * @date 2021/1/13 17:18
 * @version v1.0
 */
public abstract class AbstractFactory {

   public abstract Color getColor(String color);

   public abstract Shape getShape(String shape) ;
}