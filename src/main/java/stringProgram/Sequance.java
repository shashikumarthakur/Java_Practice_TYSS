package stringProgram;

public class Sequance {
	public static void main(String[] args) {

		String sh="aabbcaaa";
		
		
		
		for (int i = 0; i <sh.length(); i++) {
			int count=1;
			
			for (int j = i+1; j < sh.length(); j++) {
				if(sh.charAt(i)==sh.charAt(j)) {
					
					count++;
					i++;
				}
				else {
				
					break;
				}
				}
			System.out.print(sh.charAt(i)+""+count);
		}
		
	}
}
