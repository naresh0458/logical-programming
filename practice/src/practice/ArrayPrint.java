package practice;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.print("enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		

	}

}
