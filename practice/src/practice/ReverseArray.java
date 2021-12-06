package practice;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.print("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Reverse of array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
