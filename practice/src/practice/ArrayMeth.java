package practice;

import java.util.Scanner;

public class ArrayMeth {
	
	public int[] myArray()
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
	
	
	public static void display(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	


	public static void main(String[] args) {
	
		ArrayMeth b=new ArrayMeth();
		int arr[]=b.myArray();
		b.display(arr);
		

	}

}
