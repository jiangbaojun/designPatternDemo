package com.design.pattern.Singleton.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 懒汉模式 内部类实现
 *
 * 这种方式同样利用了类加载机制来保证只创建一个instance实例。它与饿汉模式一样，也是利用了类加载机制，因此不存在多线程并发的问题。
 * 不一样的是，它是在内部类里面去创建对象实例。
 * 这样的话，只要应用中不使用内部类，JVM就不会去加载这个单例类，也就不会创建单例对象，从而实现懒汉式的延迟加载。也就是说这种方式可以同时保证延迟加载和线程安全。
 */
public final class Singleton {
	public List<String> list = null;// list 属性

	private Singleton() {// 构造函数
		list = new ArrayList<String>();
	}

	// 内部类实现
	public static class InnerSingleton {
		private static Singleton instance=new Singleton();// 自行创建实例
	}

	public static Singleton getInstance() {
		return InnerSingleton.instance;// 返回内部类中的静态变量
	}
}
