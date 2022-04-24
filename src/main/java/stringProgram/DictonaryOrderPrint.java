package stringProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DictonaryOrderPrint {
	public static void main(String[] args) {
		String s="aacbabcbc";

		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) { 
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			
			for (int i = 0; i < s.length(); i++) {
				
				if(ch.equals(s.charAt(i))) {
					System.out.print(ch);
					
				}	
				
			}
			System.out.println();
				
		}
		//System.out.println();
	}
}
