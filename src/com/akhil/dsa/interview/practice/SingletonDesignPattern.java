package com.akhil.dsa.interview.practice;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable, Cloneable{
	
	private static SingletonDesignPattern singletonDesignPatternRef = null;
	
	private SingletonDesignPattern() {
		if(singletonDesignPatternRef != null) {
			throw new RuntimeException("You are trying to Break Singleton Pattern");
		}
	}
	
	public static SingletonDesignPattern getSingletonDesignPatternReference() {
		
		if(singletonDesignPatternRef == null) {
			singletonDesignPatternRef = new SingletonDesignPattern();
		}		
		return singletonDesignPatternRef;	
	}
	
	public Object readResolve() {
		return singletonDesignPatternRef;
	} 
	
	
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return singletonDesignPatternRef;
		
	}

}
