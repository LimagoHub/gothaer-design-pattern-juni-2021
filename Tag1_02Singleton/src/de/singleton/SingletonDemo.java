package de.singleton;

import java.lang.ref.WeakReference;

public class SingletonDemo {
	
	private static WeakReference<SingletonDemo> instance=new WeakReference<SingletonDemo>(new SingletonDemo());
	
	
	
	public static synchronized SingletonDemo getInstance() {
		if(instance.get() == null)
			instance = new WeakReference<SingletonDemo>(new SingletonDemo());
		return instance.get();
	}



	private SingletonDemo() {
		
	}
	
	public void log(String message) {
		System.out.println(message);
	}

}
