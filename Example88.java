//88. WAP to Print the Alternate Elements in an Array
package javaprograms;

import java.util.Scanner;

public class Example88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);

	      System.out.print("enter array size: ");
	      int size=scan.nextInt();
	      
	      int arr[]=new int[size];
	      int i=0;
	       System.out.print("enter elements : ");
	       for(i=0;i<arr.length;i++){
	           arr[i]=scan.nextInt();
	           
	       }
	       for(i=0;i<arr.length;i++){
	        if(i%2==0){
	            System.out.print(arr[i]+" ");
	        }
	       }
		}
	}	
