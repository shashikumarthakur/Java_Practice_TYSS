package stringProgram;

public class PallaindromNumber {
	public static void main(String[] args) {
		int no=121;
		int dup=no;
		int rem=0;
		int rev=0;
		
		
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		if(rev==dup) {
			System.out.println("Pallaindrom Number: "+dup);
		}
		
		else
			System.out.println("Not a Pallaindrom Number: "+dup);
		System.out.println(rev);
	}

}
