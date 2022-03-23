package com.design.pattern.prototype.impl.impl;

import com.design.pattern.prototype.impl.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
