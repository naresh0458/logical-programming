//24. Write a java program to find sum of all odd numbers between 1 to n.

package javacoding;

import java.util.Scanner;



public class PrintSumOfOddNum {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value");
		int num=sc.nextInt();
	    int sum=0;
		for(int i=1;i<=num;i++)
		{
			if((i%2)!=0) {
				
				sum=sum+i;
			
			}
		}
	
				System.out.print("sum of all odd numbers from 1 to " + num +" = " + sum);
							
		
	}
}
