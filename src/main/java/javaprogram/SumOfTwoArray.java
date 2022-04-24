package javaprogram;

public class SumOfTwoArray {

	public static void main(String[] args) {
		int[]a= {2,5,6,4,5};
		int[]b= {5,4,3,6,8,0,8};
		
		for (int i = 0; i < a.length; i++) {
			try {
			System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e) {
				System.out.println(a[a.length-1]);
			}
		}

	}

}
