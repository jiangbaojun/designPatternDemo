package com.design.pattern.Singleton.v4;

/**
 * 美剧方式实现
 */
public class Resource {

    private Resource(){}

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton{
        INSTANCE;

        private final Resource instance;

        Singleton(){
            instance = new Resource();
        }

        private Resource getInstance(){
            return instance;
        }
    }

    public static Resource getInstance(){

        return Singleton.INSTANCE.getInstance();
    }
}
