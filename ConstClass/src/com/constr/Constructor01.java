package com.constr;

public class Constructor01 {
	
	public Constructor01() {
		this(65,76,98);
		System.out.println("default constructor");
	}
	public Constructor01(int a) {
		this(23,34);
		System.out.println(1+" one parameterized constructor");		
	}
	public Constructor01(int a,int b) {
		this();
		System.out.println(2+" two parameterized constructor");		
	}
	public Constructor01(int a,int b,int c) {
		System.out.println(3+" three parameterized constructor");		
	}
	public static void main(String[] args) {
		Constructor01 co = new Constructor01(15);
		
	}

}
