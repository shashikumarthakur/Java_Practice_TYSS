package javaprogram;

public class Test {
	public static void main(String[] args) {
		int n=5;
		int count=5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <i; k++) {
				System.out.print(k);
			}
			for (int l = i; l>0; l--) {
				System.out.print(l);
			}
			System.out.println();
		}	
	}
}
