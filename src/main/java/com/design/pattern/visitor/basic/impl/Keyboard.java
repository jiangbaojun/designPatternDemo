package com.design.pattern.visitor.basic.impl;

import com.design.pattern.visitor.ComputerPartVisitor;
import com.design.pattern.visitor.basic.ComputerPart;

public class Keyboard  implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

