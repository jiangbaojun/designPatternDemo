package com.design.pattern.builder.packing;

/**
 * 袋装
 * @author jiangbaojun
 * @date 2021/1/14 14:52
 * @version v1.0
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
