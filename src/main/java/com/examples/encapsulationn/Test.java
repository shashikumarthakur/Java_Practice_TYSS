package com.examples.encapsulationn;

 class A {
	public void test() {
	System.out.println("Class A-Test()");
	}
}
class B extends A{
	public void test() {
	System.out.println("Class B-Test()");
	}
	public void run() {
		System.out.println("Class B-Run()");
	}
}
class C extends B{
	public void test() {
		System.out.println("Class C-Test()");	
	}
	public void run() {
		System.out.println("Class C-Run()");
	}
}

class Test{
	public static void main(String[] args) {
		C obj=new C();
		obj.test();
		System.out.println("-----------------------------------");
		A obj1=obj;
		obj1.test();
		
		System.out.println("-----------------------------------");
		B obj2=(B)obj1;
		obj2.test();
		obj2.run();
	}
}
