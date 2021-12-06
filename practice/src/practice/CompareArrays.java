package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		int size1=s.nextInt();
		int a1[]=new int[size1];
		System.out.println("enter first array elements");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=s.nextInt();
	}
	System.out.println("enter size of second array");
	int size2=s.nextInt();
	int a2[]=new int[size2];
	System.out.println("enter second array elements");
	for(int i=0;i<a2.length;i++)
	{
	a2[i]=s.nextInt();
	}
	if(Arrays.equals(a1, a2)) { 
		System.out.println("arrays are same");
	}
	else
	{
		System.out.println("arrays are not same");
	}

	}

}
