package javaprograms;

class Maximum 
{
	public static void main(String[] args) 
	{int[] a={50,60,70,20,60,49};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}	
			}	
		}
		System.out.println(a[0]);
		System.out.println(a[1]);



			
	}
}
