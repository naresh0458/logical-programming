//73. Write a C program to count occurrences of a character in given string.
package javaprograms;

import java.util.Scanner;

public class CountOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

	      System.out.print("enter a string : ");
	      String str=scan.nextLine();
	      
	      System.out.print("enter a character : ");
	      char ch=scan.next().charAt(0);
	      int i=0,count=0;
	      while(i<str.length()){
	          
	          if(ch==str.charAt(i)){
	              count++;
	          }
	         
	          i++;
	      }
	      System.out.println("The count of occurence is :"+count);
	      
	      
		}
	}	