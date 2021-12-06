package javapractice;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;int min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements into an array: ");
        max=sc.nextInt();
        min=max;
        
        for(int i=1;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        	if(max<arr[i]) {
        		max=arr[i];
        		
        	}
        	if(min>arr[i]) {
        		min=arr[i];
        	}
        }
System.out.println(max+" "+min);
	}

}
