package org.example.test;



@FunctionalInterface
public interface MyInterface {
	
	void m1();
	
	default void m2() {
		System.err.println("hii");
	}
	
	static void m3() {
		System.err.println("hii");
	}
	
}
	
	