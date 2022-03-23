package com.design.pattern.visitor.basic;

import com.design.pattern.visitor.ComputerPartVisitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
