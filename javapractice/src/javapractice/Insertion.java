package javapractice;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int s=sc.nextInt();
		int arr[]=new int [s+1];
		System.out.println("Enter elements");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position to insert element");
		int p=sc.nextInt();
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(p==i) {
				for(int j=arr.length-1;j>i;j--) {
					arr[j]=arr[j-1];
				}
				arr[i]=key;
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
