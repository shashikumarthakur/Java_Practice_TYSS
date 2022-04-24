package stringProgram;

import java.util.HashSet;

public class OccurrenceOfWord {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] store=s.split(" ");
		
		HashSet<String> set=new HashSet<String>();
		
		//To add in HashSet
		for (int i = 0; i < store.length; i++) {
			set.add(store[i]);
		}
		
		//Compare String[]store with Hashset
		for(String str:set) {
			int count=0;
			for (int i = 0; i < store.length; i++) {
				if(str.equals(store[i])) {
					count++;
				}
			}
			System.out.println(str+"------>"+count); 
		}
	}

}
