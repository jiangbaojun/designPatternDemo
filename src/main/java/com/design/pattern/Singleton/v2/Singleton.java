package com.design.pattern.Singleton.v2;

// 懒汉模式 + synchronized 同步锁 + double-check
public final class Singleton {
    private volatile static Singleton instance= null;// 不实例化
    private Singleton(){}// 构造函数
    public static Singleton getInstance(){// 加同步锁，通过该函数向整个系统提供实例
        if(null == instance){// 第一次判断，当 instance 为 null 时，则实例化对象，否则直接返回对象
          synchronized (Singleton.class){// 同步锁
             if(null == instance){// 第二次判断
                instance = new Singleton();// 实例化对象
             }
          }
        }
        return instance;// 返回已存在的对象
    }
}
