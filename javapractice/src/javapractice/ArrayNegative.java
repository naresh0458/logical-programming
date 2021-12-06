//50. Write a C program to print all negative elements in an array.

package javapractice;

import java.util.Scanner;

public class ArrayNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array");
       int size=sc.nextInt();
       System.out.println("Enter the elements into array");
       int arr[]=new int[size];
       
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
    	   
       }
       System.out.print("Negative elements are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
	    		   System.out.print(arr[i]+" ");
	    	   }
		}
		
	}

}
