package javaprogram;



public class SumofTwoArray2 {

	public static void main(String[] args) {
		int[]a = {1,2,4,6,7};
		int b[]= {2,1,3,4};
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
			System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length>b.length) {
				System.out.println(a[i]);	
				}
				else
					System.out.println(b[i]);
				}
			}
	}

}
