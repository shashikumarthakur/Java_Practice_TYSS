package javaprogram;

public class OccuranceOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,6,2,2,2,5,4,4,6,1};
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]&& i>j) {
					count++;
				System.out.println(a[i]+"-----"+count);
				}
				
			}
			a[i]=0;
		}

	}

}
