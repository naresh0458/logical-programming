//38. Write a C program to calculate factorial of a number.
package javaprograms;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number =");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of " +num+" = " +fact);
	}

}
