package com.kxw.niuke;

public class ObjectTest {
	
	public static void main(String[] args) {
		Object o = new Object(){

			@Override
			public boolean equals(Object obj) {
				return true;
			}
			
		};
		System.out.println(o.equals("abc"));
	}
	
}
