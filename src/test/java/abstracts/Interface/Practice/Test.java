package abstracts.Interface.Practice;

import java.util.LinkedHashSet;

import stringProgram.PossitionOfCharacter;

public class Test{
	/*
	 * public static void main(String[] args) { String s="india"; int count=0;
	 * 
	 * // HashSet set=new HashSet(); for (int i = 0; i < s.length(); i++) {
	 * if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' ||
	 * s.charAt(i)=='o' || s.charAt(i)=='u') { count++; }
	 * 
	 * } System.out.println("Vowel Charchater Without Dupplicate---> "+count);
	 * count=0; LinkedHashSet<Character> lhs=new LinkedHashSet<Character>(); for
	 * (int i = 0; i < s.length(); i++) { lhs.add(s.charAt(i)); }
	 * 
	 * for(Character ch:lhs) {
	 * 
	 * if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals(
	 * 'u')) { count++; }
	 * 
	 * } System.out.println("Vowel Charchater ---> "+count);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		String[] str= {"hi","hello","india"};
		
		
		for(String st:str) {
			int count=0;
			for (int j = 0; j < st.length(); j++) {
				if(st.charAt(j)=='a' ||st.charAt(j)=='e' || st.charAt(j)=='i' || st.charAt(j)=='o' || st.charAt(j)=='u')
				{
					count++; 
				}
				
			}
			
			System.out.println(st+"-"+count);
			}
				
			}
			
		
	}


