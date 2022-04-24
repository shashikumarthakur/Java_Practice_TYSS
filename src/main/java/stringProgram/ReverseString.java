package stringProgram;

public class ReverseString {
	public static void main(String[] args) {
		String s="Test Yantra";
		String rev="";
		char[] store=s.toCharArray();
		int charlength=store.length;
		int count=0;
		for (char c : store) {
			count++;
		}
		
		for (int i = charlength-1; i>=0; i--) {
		//System.out.print(s.charAt(i));
		rev=rev+s.charAt(i);
		}
		System.out.println(count);
		System.out.println(rev);
	}
}
