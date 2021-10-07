//69. Write a C program to check whether a string is palindrome or not.
package javaprograms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);

	      System.out.print("enter a string : ");
	      String str=scan.nextLine();
	      
	     
	           
	     String reverse="";
	      for(int i=str.length()-1;i>=0;i--){
	        
	            reverse=reverse+str.charAt(i);
	            
	          
	      }
	      
	      if(str.equals(reverse)){
	          System.out.println("palindrome");
	      }
	      else{
	          System.out.println("not palindrome");
	      }
		}
	}	