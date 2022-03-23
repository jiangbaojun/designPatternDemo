package com.design.pattern.builder;

/**
 * 建造者模式
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 * 将复杂对象层层抽象为简单类目，再进行多样性组合。
 * @author jiangbaojun
 * @date 2021/1/14 15:01
 * @version v1.0
 */
public class TestDemo {
   public static void main(String[] args) {
      MealBuilder mealBuilder = new MealBuilder();
 
      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " +vegMeal.getCost());
 
      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " +nonVegMeal.getCost());
   }
}