package javaprograms;

 import java.util.Scanner;
 class Patternn

{
	public static void main(String[]args)
	{
		//piramid
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++){
			System.out.print("*");
			}
			for(int l=1;l<i;l++){
				System.out.print("*");
			}
		
			System.out.println("*");
		}

	System.out.println();

	//2nd


		for(int i=1;i<=5;i++){

			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();	
		}

		System.out.println();

//3rd diamond

		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++){
			System.out.print("*");
			}
			for(int l=1;l<i;l++){
				System.out.print("*");
			}
		
			System.out.println("*");

		}
		for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>i;k--){
			System.out.print("*");
			}
			for(int l=5;l>i;l--){
				System.out.print("*");
			}
		
			System.out.println("*");

		}
		
	}
}
























