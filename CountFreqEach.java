//76. Write a java program to count frequency of each character in a string
package javaprograms;

import java.util.Scanner;

public class CountFreqEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);

	      System.out.print("enter a string : ");
	      String str=scan.nextLine();
	      char arr[]=str.toCharArray();
	       int count=0;
	      
	      for(int i=0;i<str.length();i++){
	          for(int j=i+1;j<str.length();j++){
	              if(arr[i]==arr[j]){
	                  arr[j]=' ';
	                  count++;
	              }
	          }
	          
	          if(count>0 && arr[i]!=' '){
	              System.out.println(" The frequency of "+str.charAt(i)+" is "+count);
	          }
	          count=0;
	      }
		}
	}	
