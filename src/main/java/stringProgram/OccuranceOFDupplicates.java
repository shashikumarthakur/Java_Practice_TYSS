package stringProgram;

import java.util.HashSet;

public class OccuranceOFDupplicates {
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
			if(count>1)
			System.out.println("Dupplicates------>"+ch+"------"+count);
			else if(count==1)
				System.out.println("Unique------->"+ch+"------"+count);
				
		}
		
		//System.out.println(set);
	}

}
