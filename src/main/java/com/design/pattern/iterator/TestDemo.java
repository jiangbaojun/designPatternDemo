package com.design.pattern.iterator;

/**
 * 迭代器模式（Iterator Pattern）
 * 用于顺序访问集合对象的元素，不需要知道集合对象的底层表示
 */
public class TestDemo {

    public static void main(String[] args) {
        String[] names = {"Robert", "John", "Julie", "Lora"};
        NameContainer namesRepository = new NameContainer(names);

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
