//51. Write a C program to find second largest element in an array.

package javapractice;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;int smax=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements into an array:");
		 max=sc.nextInt();
		
		
		 
		for(int i=1;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				smax=max;
				max=arr[i];
			}
			else if(smax<arr[i]){
				smax=arr[i];
				
			}
		}
		System.out.print("second largest element is:" +smax);
			}

		}

		
	