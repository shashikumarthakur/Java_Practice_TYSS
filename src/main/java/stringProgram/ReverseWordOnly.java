package stringProgram;

import java.util.HashSet;

public class ReverseWordOnly {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] store=s.split(" ");
		String rev="";
	
		for (int i = store.length-1; i >= 0; i--) {
			System.out.print(store[i]+" ");
		}
		
		
	}

}
