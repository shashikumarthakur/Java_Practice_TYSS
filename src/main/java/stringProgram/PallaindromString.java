package stringProgram;

public class PallaindromString {
	public static void main(String[] args) {
		String s="RACECAR";
		String rev="";
		for (int i = s.length()-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("String is Pallaindrom ");
		}
		else
			System.out.println("String not Pallaindrom");
	}
}
