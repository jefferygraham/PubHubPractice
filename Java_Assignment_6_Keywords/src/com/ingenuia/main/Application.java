package com.ingenuia.main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		System.out.println(sc.add(1.1f, 2.2f));
		
		FinalClass fc = new FinalClass();
		System.out.println(fc.finalNum);
		
		ConcreteClass cc = new ConcreteClass();
		System.out.println(cc.run("really"));
	}

}
