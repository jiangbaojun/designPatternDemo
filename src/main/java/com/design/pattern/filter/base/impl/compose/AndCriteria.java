package com.design.pattern.filter.base.impl.compose;

import com.design.pattern.filter.Person;
import com.design.pattern.filter.base.Criteria;

import java.util.List;

/**
 * 组合标准-并且条件
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 将两个标准结果，进行并且过滤
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
