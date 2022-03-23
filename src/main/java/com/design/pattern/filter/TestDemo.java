package com.design.pattern.filter;

import com.design.pattern.filter.base.Criteria;
import com.design.pattern.filter.base.impl.*;
import com.design.pattern.filter.base.impl.compose.AndCriteria;
import com.design.pattern.filter.base.impl.compose.OrCriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * 使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class TestDemo {
   public static void main(String[] args) {
      List<Person> persons = new ArrayList<Person>();
 
      persons.add(new Person("Robert","Male", "Single"));
      persons.add(new Person("John","Male", "Married"));
      persons.add(new Person("Laura","Female", "Married"));
      persons.add(new Person("Diana","Female", "Single"));
      persons.add(new Person("Mike","Male", "Single"));
      persons.add(new Person("Bobby","Male", "Single"));

      //简单标准
      Criteria male = new CriteriaMale();
      Criteria female = new CriteriaFemale();
      Criteria single = new CriteriaSingle();
      //组合标准
      Criteria singleMale = new AndCriteria(single, male);
      Criteria singleOrFemale = new OrCriteria(single, female);
 
      System.out.println("Males: ");
      printPersons(male.meetCriteria(persons));
 
      System.out.println("\nFemales: ");
      printPersons(female.meetCriteria(persons));
 
      System.out.println("\nSingle Males: ");
      printPersons(singleMale.meetCriteria(persons));
 
      System.out.println("\nSingle Or Females: ");
      printPersons(singleOrFemale.meetCriteria(persons));
   }
 
   public static void printPersons(List<Person> persons){
      for (Person person : persons) {
         System.out.println("Person : [ Name : " + person.getName() 
            +", Gender : " + person.getGender() 
            +", Marital Status : " + person.getMaritalStatus()
            +" ]");
      }
   }      
}