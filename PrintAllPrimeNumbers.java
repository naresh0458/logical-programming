//40. Write a C program to print all Prime numbers between 1 to n.
package javaprograms;

import java.util.Scanner;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number=");
		int num=sc.nextInt();
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
				System.out.print(i+" ");
			}
		}
		
		
	}

}
