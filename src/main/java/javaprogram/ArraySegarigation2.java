package javaprogram;

public class ArraySegarigation2 {

	public static void main(String[] args) {
		int [] a= {0,1,0,1};
		int []b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n--;
			}else {
				b[m]=a[i];
				m++;
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
	
	
	}

}
