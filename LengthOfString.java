//64. Write a java program to find length of a string and compare and concatenate two     strings.
package javaprograms;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		    System.out.println("enter String:"); 
		    String str1=scan.next();
		    
		    System.out.println("enter another String:"); 
		    String str2=scan.next();
		    
		    System.out.println("length of string is : "+str1.length());
		    
		    System.out.println("comparison of string is : "+(str1.equals(str2)));

	        System.out.println("length of string is : "+str1.concat(str2));
		    	    
		}
	}	
