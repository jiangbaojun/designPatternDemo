package com.design.pattern.iterator;

/**
 * 相当于list、set集合，对数组进行包装，提供获取迭代器方法
 */
public class NameContainer implements Container {
    public String[] names;

    public NameContainer(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(this);
    }

}
