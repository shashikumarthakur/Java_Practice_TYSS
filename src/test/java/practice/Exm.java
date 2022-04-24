package practice;

public class Exm {
	public static void main(String[] args) {
		int num=568;
		int rem=0;
		
		
		while(num>9) {
			int sum=0;
													
			while(num>0){

				rem=num%10;
				sum=sum+rem;
				num=num/10;	
				
			}
			num=sum;
		}
		
		System.out.println(num);
		
		
	}
}
