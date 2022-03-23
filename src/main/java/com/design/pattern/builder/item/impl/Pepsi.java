package com.design.pattern.builder.item.impl;

import com.design.pattern.builder.item.ColdDrink;

/**
 * 百事冷饮
 * 具体实现
 * @author jiangbaojun
 * @date 2021/1/14 14:58
 * @version v1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
