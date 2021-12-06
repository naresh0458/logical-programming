package practice;

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter size1");
	int size1=s.nextInt();
	System.out.print("enter size2");
	int size2=s.nextInt();
	int ar[][]=new int[size1][size2];
	System.out.print("enter array elements");
	for(int i=0;i<size1;i++)
	{
		for(int j=0;j<size2;j++)
		{
			ar[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<size1;i++)
	{
		for(int j=0;j<size2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();   
	}
	

	}

	
}
