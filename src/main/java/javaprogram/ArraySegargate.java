package javaprogram;

public class ArraySegargate {
	public static void main(String[] args) {
		int[] a= {0,1,1,0,1,0,1,0,1};
		
		int[]b=null;
		int[] c=null;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++;
			}
		}
		b=new int[count];
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count=0;
				b[count++]=a[i];
			}
			
		}
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
		
			
	}

}
