package com.design.pattern.builder.item;

import com.design.pattern.builder.packing.Bottle;
import com.design.pattern.builder.packing.Packing;

/**
 * 抽象冷饮类目
 * @author jiangbaojun
 * @date 2021/1/14 14:54
 * @version v1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
