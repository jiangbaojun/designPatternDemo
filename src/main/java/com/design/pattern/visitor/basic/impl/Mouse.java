package com.design.pattern.visitor.basic.impl;

import com.design.pattern.visitor.ComputerPartVisitor;
import com.design.pattern.visitor.basic.ComputerPart;

/**
 * @author jiangbaojun
 * @version v1.0
 * @workid 1861
 * @date 2022/3/23 15:46
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
