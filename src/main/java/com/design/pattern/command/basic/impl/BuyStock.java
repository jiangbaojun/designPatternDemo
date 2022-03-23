package com.design.pattern.command.basic.impl;

import com.design.pattern.command.basic.Stock;
import com.design.pattern.command.basic.Order;

public class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}
