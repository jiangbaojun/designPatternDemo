package com.design.pattern.command.basic.impl;

import com.design.pattern.command.basic.Stock;
import com.design.pattern.command.basic.Order;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
