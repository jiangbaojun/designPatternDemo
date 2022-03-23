package com.design.pattern.builder.item;

import com.design.pattern.builder.packing.Packing;

/**
 * 简单类目。可能是汉堡、饮料
 * @author jiangbaojun
 * @date 2021/1/14 14:48
 * @version v1.0
 */
public interface Item {
   public String name();
   public Packing packing();
   public float price();    
}
