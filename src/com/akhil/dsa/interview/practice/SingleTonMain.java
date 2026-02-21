package com.akhil.dsa.interview.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingleTonMain {
	
	public static void main(String[] args) throws Exception {
		
		SingletonDesignPattern ref1 = SingletonDesignPattern.getSingletonDesignPatternReference();
		System.out.println("ref1 Hashcode :: "+ref1.hashCode());
		
		/*SingletonDesignPattern ref2 = SingletonDesignPattern.getSingletonDesignPatternReference();
		System.out.println("ref2 Hashcode :: "+ref2.hashCode());*/
		
		
		//Breaking singleton Design Pattern 
		
		//Getting new Instance Using Constructor Instance
		/*try {
			Constructor<SingletonDesignPattern> constructor =  SingletonDesignPattern.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			SingletonDesignPattern ref3 = constructor.newInstance();
			System.out.println("ref3 Hashcode :: "+ref3.hashCode());		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Using Serialization and DeSerialization
		/*ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oop.writeObject(ref1);
		
		System.out.println("Serialization Complete ..");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		SingletonDesignPattern ref4 = (SingletonDesignPattern) ois.readObject();
		
		System.out.println("De Serialization Complete ..");
		System.out.println("redf4 Hashcode :: "+ref4.hashCode());*/
		
		//Using Clone Methods
		SingletonDesignPattern ref4 = (SingletonDesignPattern) ref1.clone();
		System.out.println("ref4 Hashcode :: "+ref4.hashCode());
		
	}

}
