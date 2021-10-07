//56. Write a C program to delete an element from an array at specified position.
package javaprograms;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int n=sc.nextInt();
		System.out.print("Enter elements in an array:");
		int[] arr=new int[n];
		
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("Enter index position:");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
				if(num==i) {
					while(i<arr.length-1) {
					arr[i]=arr[i+1];
					i++;
					}
				}
			
			}
		System.out.println("after deletion ");
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]+" ");
		}
		}
		
	}


