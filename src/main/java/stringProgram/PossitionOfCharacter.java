package stringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PossitionOfCharacter {
	public static void main(String[] args) {
		String ls="Shashi";
		String s=ls.toLowerCase();
		//HashSet<Character> set=new HashSet<Character>();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) { 
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				
				if(ch.equals(s.charAt(i))) {
					count++;
					System.out.println("Unique--->"+ch+"------"+"Accurance-"+count+"----->Possion "+i);	
				}	
				
			}

//			 if(count==1)
			//	System.out.println("Unique--->"+ch+"------"+"Accurance-"+count+"----->Possion "+s.indexOf(ch));
				
		}
		

}
}