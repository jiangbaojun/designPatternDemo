package com.design.pattern.filter.base.impl;

import com.design.pattern.filter.Person;
import com.design.pattern.filter.base.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单标准-限定单身性
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
