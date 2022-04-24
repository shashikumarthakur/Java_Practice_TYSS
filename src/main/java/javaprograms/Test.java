package javaprograms;

class Test 
{
	public static void main(String[] args) 
	{
		for(int i=6;i>=1;i--){

			for(int j=i-1;j>=1;j--){
				
				if(j>=2)
				System.out.print(j+"*");
				else
					System.out.print(j);
			}
			System.out.println();
					
		}
	}
}
