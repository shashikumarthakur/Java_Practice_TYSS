package com.examples.encapsulationn;

public class Runner {
	
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
