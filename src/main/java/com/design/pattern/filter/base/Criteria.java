package com.design.pattern.filter.base;

import com.design.pattern.filter.Person;

import java.util.List;

/**
 * 标准模式接口
 */
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}