package stringProgram;

import java.util.HashSet;

public class OccuranceOFString {
	public static void main(String[] args) {
		String ls="SHaSHi";
		String s=ls.toLowerCase();
		HashSet<Character> set=new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				
				if(ch.equals(s.charAt(i))) {
					count++;	
				}	
				
			}
			System.out.println(ch+"------"+count);
		}
		//System.out.println(set);
	}

}
