//36. Write a java program to find power of a number using for loop.
package javaprograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your base value=");
       int base=sc.nextInt();
       System.out.println("Enter your exponent value=");
       int exponent=sc.nextInt();
       int expo=exponent;
       long power=1;
       while(exponent!=0)
       {
    	   power=power*base;
    	   --exponent;
       }
       System.out.println(base+" to the power of " +expo+ "= " +power);
	}
	

}
