package test.practice;
class Child extends Parent {
	public Child() {
		this(10);
	}
	public Child(int x) { 
	this("shashi");
		System.out.println(x+" Child");
		
	}
	public Child(String s) {
		System.out.println(s+" Child");
	}
}

public class Test {
	public static void main(String[] args) {
		Child ch=new Child();
		
	}
}
