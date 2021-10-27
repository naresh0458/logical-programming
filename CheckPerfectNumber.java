//45. Write a java program to check whether a number is Perfect number or not.
package javaprograms;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your number=");
   int number=sc.nextInt();
   int sum=0;
   for(int i=1;i<number;i++)
   {
	   if(number%i==0) {
		   sum=sum+i;
	   }
   }
	if(sum==number) {
		System.out.println("Given number is a perfect number");
	}
	else {
		System.out.println("Given number is not a perfect number");
	}
		
	}

}
