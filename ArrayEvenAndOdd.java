//53. Write a java program to count total number of even and odd elements in an array.
package javaprograms;

import java.util.Scanner;

public class ArrayEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ocount=0,ecount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter your elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]%2==0) {
				ecount++;
			
		}
			else {
				ocount++;
			}
		
		
		}
		System.out.println("even numbers are:" +ecount);
		System.out.println("odd numbers are:" +ocount);
		
		
	}

}
