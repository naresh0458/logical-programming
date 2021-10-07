//65. Write a C program to find total number of alphabets, digits or special     character in a string.
package javaprograms;

import java.util.Scanner;

public class TotalNumOfAlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		    System.out.println("enter String:"); 
		    String str=scan.next();
		    
		    int alpa=0,digit=0,special=0;
		    for(int i=0;i<str.length();i++){
		       if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z') ){
		           alpa++;
		       }else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		           digit++;
		       }   
		       else{
		           special++;
		       }
		        
		    }
		    
		    System.out.println("Alphabets count :"+alpa);
		    System.out.println("digits count :"+digit);
		     System.out.println("Special characters  :"+special);
		}
	}	
