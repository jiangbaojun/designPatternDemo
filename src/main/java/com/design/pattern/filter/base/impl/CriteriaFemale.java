package com.design.pattern.filter.base.impl;

import com.design.pattern.filter.Person;
import com.design.pattern.filter.base.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单标准-限定女性
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
