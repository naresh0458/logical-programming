package practice;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[arr.length];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("elements of original:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("elements of copyarray:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	} 

}
