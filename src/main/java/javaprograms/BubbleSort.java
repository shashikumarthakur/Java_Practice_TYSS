package javaprograms;

class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a={50,60,70,20,60,49};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;


					
				}
				
			}
			
		}
		for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
	}
}
