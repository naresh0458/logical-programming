//25. Write a C program to print multiplication table of any number.
package javacoding;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your number:");
      int num=sc.nextInt();
      for(int i=1;i<=15;i++) {
    	  System.out.println(num+" * " +i+" = " +num*i);
      }
      
      
      
	}

}
