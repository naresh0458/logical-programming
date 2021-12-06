package practice;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int avg=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("enter array elements");
    for(int i=0;i<ar.length;i++)
    {
    	ar[i]=s.nextInt();
    }
    for(int i=0;i<ar.length;i++)
    {
    	sum=sum+ar[i];
    }
    avg=sum/ar.length;
    System.out.println("The average of array elements is"+avg);
	}

}
