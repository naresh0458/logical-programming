//70. Write a java program to find first occurrence of a character in a given string.
package javaprograms;

import java.util.Scanner;

public class FirstOccurance {

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
	          
	          
	          if(count==1){
	          System.out.println("The first ocurrence of :"+ch+" is "+i);
	          
	          break;
	          }
	          i++;
	      }
	      
	      
		}
	}	
