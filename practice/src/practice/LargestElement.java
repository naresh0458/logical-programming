package practice;

import java.util.Scanner;

public class LargestElement {

	
	public static void main(String[] args) {
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.print("enter elements of array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		
		}
		System.out.println(max);
	}

}
