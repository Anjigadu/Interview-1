package com.kxw.niuke;

@SuppressWarnings("static-access")
public class TestClass {
	
	C c = new C();
	
	private static void testMethod(){
		System.out.println("testMethod");
	}
	
	public static void main(String[] args) {
		((TestClass)null).testMethod();
	}
}
class C {
	C(){
		System.out.println("c");
	}
}