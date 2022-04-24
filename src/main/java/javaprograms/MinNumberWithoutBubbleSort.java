package javaprograms;

class MinNumberWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]={5,8,6,9};
		int fmin=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<fmin){
				fmin
					=a[i];
			}
		
		}
		System.out.println(fmin);
	}
}
