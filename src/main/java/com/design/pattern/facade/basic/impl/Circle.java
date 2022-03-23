package com.design.pattern.facade.basic.impl;

import com.design.pattern.facade.basic.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
