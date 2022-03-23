package com.design.pattern.facade.basic.impl;

import com.design.pattern.facade.basic.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
