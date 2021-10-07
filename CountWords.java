//67. Write a C program to count total number of words in a string.
package javaprograms;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan=new Scanner(System.in);

	      System.out.print("enter a string : ");
	      String str=scan.nextLine();
	      
	      String arr[]=str.split(" ");
	      
	      System.out.println("number of words : "+arr.length);
		}
	}	
