package stringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {9,9,9};
		int c[]=null;
		
		for (int i = 0; i < a.length; i++) {
			
			int sum=a[i]+b[i];
			System.out.println(sum);
			if(sum>9) {
				int rem=sum%10;
				int div=sum/10;
				
				System.out.print(rem+div+" ");
			}
		}
		
		/*
		 * String s="india"; String sum=""; for (int i = 0; i < s.length(); i++) {
		 * sum=sum+s.charAt(i); System.out.println(sum); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
/*
 * s=india i in ind indi india
 */

/*
 * s="aabbbcca"; a2b3c2a1
 */


//a[]={1,2,3,4,5}
//key=2
//3 4 5 1 2