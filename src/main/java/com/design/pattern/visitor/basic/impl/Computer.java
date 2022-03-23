package com.design.pattern.visitor.basic.impl;

import com.design.pattern.visitor.ComputerPartVisitor;
import com.design.pattern.visitor.basic.ComputerPart;

/**
 * @author jiangbaojun
 * @version v1.0
 * @workid 1861
 * @date 2022/3/23 15:46
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
