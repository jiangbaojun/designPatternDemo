package com.design.pattern.visitor;

import com.design.pattern.visitor.basic.impl.Computer;
import com.design.pattern.visitor.basic.impl.Keyboard;
import com.design.pattern.visitor.basic.impl.Monitor;
import com.design.pattern.visitor.basic.impl.Mouse;

public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}
