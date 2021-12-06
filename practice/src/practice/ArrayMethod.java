package practice;

import java.util.Scanner;

public class ArrayMethod {
	public static int[] myArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
	
	return arr;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] b=myArray();

	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
	}
		
	
}
