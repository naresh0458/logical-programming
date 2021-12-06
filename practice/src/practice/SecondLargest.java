package practice;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		 int max=0,smax=0;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the size");
	int size=s.nextInt();
	int a[]=new int[size];
	System.out.print("enter array elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			smax=max;
			max=a[i];
		}
		else if(a[i]>smax)
		{
			smax=a[i];
		}
	}
System.out.println("The second largest element of array is"+smax);

	}

}
