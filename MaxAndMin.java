//52. Write a java program to find maximum and minimum element in an array.
package javaprograms;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter array elements");
		int max=sc.nextInt();
		int min=max;
		int smax=0;
		for(int i=1;i<n;i++) {
			array[i]=sc.nextInt();
			if(max<array[i]) {
				smax=max;
				max=array[i];
				
				
			}
			else if(smax<array[i]) {
				
				smax=array[i];
			}
			else if(min>array[i]) {
				min=array[i];
			}
			
		}
		
		System.out.println("maximum number is:" +max);
		System.out.println("minimum number is:" +min);
		
		
		
	}

}
