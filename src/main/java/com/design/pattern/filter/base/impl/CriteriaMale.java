package com.design.pattern.filter.base.impl;

import com.design.pattern.filter.Person;
import com.design.pattern.filter.base.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单标准-限定男性
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

