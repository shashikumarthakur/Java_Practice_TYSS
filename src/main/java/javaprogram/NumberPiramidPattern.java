package javaprogram;

public class NumberPiramidPattern {
	public static void main(String[] args) {
		
		int count=1;
		int scount=1;
		int r=0;
		
		
		for (int i = 0; i <= 5; i++) {
			
			for (int j = 5; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(count);
				count++;
			}
			for (int l =0 ; l <5 ; l++) {
				//System.out.print();
			}
			
			System.out.println();
			count=1;
			scount++;
			

	}
	}
}
