package practice;

import java.util.Scanner;

public class LenearSearch {

	public static void main(String[] args) {
		int b=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter Size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter value");
		int value=s.nextInt();
		System.out.print("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				System.out.println(a[i]+"element is present in array");
				b=1;
				break;
			}
			else
			{
			b=0;	
			}
		}
		if(b==0)
		{
			System.out.println(value+"element is not present in array");	
		}

	}

}
