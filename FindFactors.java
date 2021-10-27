//37. Write a java program to find all factors of a number.
package javaprograms;

import java.util.Scanner;

public class FindFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number=");
		int num=sc.nextInt();
		System.out.print("The Factors Of "+num+" = ");
		for(int i=2;i<=num;i++)
		{
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	
}
