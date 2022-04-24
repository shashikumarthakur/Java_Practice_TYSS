package practice;

import java.util.Scanner;

public class GratestAndSmallestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1;
		double num,gr=0,sm;
		String s;
		s=sc.nextLine();
		num=Double.parseDouble(s);
		gr=num;
		sm=num;
		System.out.println("Enter 9 Number: ");
		while(c<=9) {
			s=sc.nextLine();
			num=Double.parseDouble(s);
			if(num>gr)
				gr=num;
			if(num<sm)
				sm=num;
			c++;
				
		}
		System.out.println("Greatest Number is: "+gr);
		System.out.println("Smallest Number is: "+sm);
	}

}
