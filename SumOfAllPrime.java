//41. Write a java program to find sum of all prime numbers between 1 to n.

package javaprograms;

import java.util.Scanner;

public class SumOfAllPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=sc.nextInt();
		System.out.println(num+" prime numbers are=");
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
				System.out.print(i+" ");
				
			}
		
		}
		System.out.print("\nSum of all prime numbers from 1 to " +num+" =" +sum);
	}

}
