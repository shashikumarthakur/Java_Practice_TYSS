package javaprogram;

import java.util.Iterator;

public class RighTrianglePattern {

	public static void main(String[] args) {
		//column
		for (int i = 0; i < 5; i++) {
			//row
			for (int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
