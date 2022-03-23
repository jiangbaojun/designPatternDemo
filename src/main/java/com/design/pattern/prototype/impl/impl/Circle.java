package com.design.pattern.prototype.impl.impl;

import com.design.pattern.prototype.impl.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
