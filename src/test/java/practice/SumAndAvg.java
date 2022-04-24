package practice;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int c=1,sum=0,num=0;
	double av;
	System.out.println("Enter 10 number");
	while(c<=10) {
	String s=sc.nextLine();
	num=Integer.parseInt(s);
	sum=sum+num;
	c++;
	}
		av=(double)sum/10;
		System.out.println("Sum is: "+sum);
		System.out.println("Average is : "+av);
}
}