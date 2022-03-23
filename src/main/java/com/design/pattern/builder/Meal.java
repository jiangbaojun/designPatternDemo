package com.design.pattern.builder;

import com.design.pattern.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体类目列表，构成一次餐食
 * @author jiangbaojun
 * @date 2021/1/14 15:00
 * @version v1.0
 */
public class Meal {
   private List<Item> items = new ArrayList<Item>();
 
   public void addItem(Item item){
      items.add(item);
   }
 
   public float getCost(){
      float cost = 0.0f;
      for (Item item : items) {
         cost += item.price();
      }        
      return cost;
   }
 
   public void showItems(){
      for (Item item : items) {
         System.out.print("Item : "+item.name());
         System.out.print(", Packing : "+item.packing().pack());
         System.out.println(", Price : "+item.price());
      }        
   }    
}