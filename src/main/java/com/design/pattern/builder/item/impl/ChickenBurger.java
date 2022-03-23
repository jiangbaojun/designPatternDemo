package com.design.pattern.builder.item.impl;

import com.design.pattern.builder.item.Burger;

/**
 * 鸡肉汉堡
 * 具体实现
 * @author jiangbaojun
 * @date 2021/1/14 14:56
 * @version v1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
