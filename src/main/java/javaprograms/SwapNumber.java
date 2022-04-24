package javaprograms;

class SwapNumber 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int temp=0;
		temp=a;
		a=b;
		b=temp;

		System.out.println("A: "+a);
		System.out.println("B: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}
