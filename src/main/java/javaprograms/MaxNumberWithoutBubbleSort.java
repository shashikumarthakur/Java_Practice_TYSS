package javaprograms;

class MaxNumberWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int a[]={5,8,6,9};
		int fmax=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>fmax){
				fmax=a[i];
			}
		
		}
		System.out.println(fmax);
	}
}
