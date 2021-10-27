//55. Write a java program to copy all elements from an array to another array.
package javaprograms;

import java.util.Scanner;

public class CoppyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter your elements:");
		int[] arr2=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr2[i]=arr[i];
			
		}
		for(int i=0;i<n;i++) {
			System.out.print("original array" +arr[i]+" ");
		}
		System.out.print("\ncopied array is:");
		for(int i=0;i<n;i++) {
			System.out.print( +arr2[i]+" ");
		}

}
}
