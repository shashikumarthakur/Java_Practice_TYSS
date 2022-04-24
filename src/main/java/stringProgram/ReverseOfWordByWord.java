package stringProgram;

import java.util.HashSet;

public class ReverseOfWordByWord {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] store=s.split(" ");
		String rev="";
		
//		HashSet<String> set=new HashSet<String>();
		
		//To add in HashSet
//		for (int i = 0; i < store.length; i++) {
//			set.add(store[i]);
//		}
		
		//Compare String[]store with Hashset
		for(String str:store) {
			int count=0;
			for (int i = str.length()-1; i >= 0; i--) {
				rev=rev+str.charAt(i);
			}
			System.out.print(rev+" ");
			rev="";
		}
		
		
	}

}
