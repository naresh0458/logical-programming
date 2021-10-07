//68. Write a C program to find reverse of a string.
package javaprograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);

	      System.out.print("enter a string : ");
	      String str=scan.nextLine();
	      
	      System.out.println("before string reverse :");
	      for(int i=0;i<str.length();i++){
	          System.out.print(str.charAt(i)+" ");
	      }
	      
	      System.out.println("after  string reverse :");
	      for(int i=str.length()-1;i>=0;i--){
	          System.out.print(str.charAt(i)+" ");
	      }
		}
	}	
