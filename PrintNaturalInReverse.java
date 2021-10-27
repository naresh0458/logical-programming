//18. Write a java program to print all natural numbers in reverse (from n to 1). -     using while loop
package javaprograms;

import java.util.Scanner;

public class PrintNaturalInReverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int num=sc.nextInt();
		int i=num;
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
		
	}

}
