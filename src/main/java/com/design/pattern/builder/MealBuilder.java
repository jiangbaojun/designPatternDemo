package com.design.pattern.builder;

import com.design.pattern.builder.item.impl.ChickenBurger;
import com.design.pattern.builder.item.impl.Coke;
import com.design.pattern.builder.item.impl.Pepsi;
import com.design.pattern.builder.item.impl.VegBurger;

/**
 * 预设餐食（套餐）
 * @author jiangbaojun
 * @date 2021/1/14 15:01
 * @version v1.0
 */
public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}