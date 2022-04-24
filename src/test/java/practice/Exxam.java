package practice;

import java.util.Iterator;

public class Exxam {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int key=2;
		
		for (int i = 0; i < key; i++) {
			int temp=a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

// int n=123;
//o/p=1 2 3
//11 22 33
//111 222 333
