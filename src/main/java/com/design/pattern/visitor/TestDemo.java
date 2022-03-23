package com.design.pattern.visitor;

import com.design.pattern.visitor.basic.ComputerPart;
import com.design.pattern.visitor.basic.impl.Computer;

/**
 * 访问者模式（Visitor Pattern）
 *
 * 我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 *
 * 意图：主要将数据结构与数据操作分离。
 * 主要解决：稳定的数据结构和易变的操作耦合问题。
 */
public class TestDemo {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}
