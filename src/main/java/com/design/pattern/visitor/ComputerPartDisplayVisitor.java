package com.design.pattern.visitor;

import com.design.pattern.visitor.basic.impl.Computer;
import com.design.pattern.visitor.basic.impl.Keyboard;
import com.design.pattern.visitor.basic.impl.Monitor;
import com.design.pattern.visitor.basic.impl.Mouse;
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

   @Override
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }

   @Override
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }

   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }

   @Override
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}
