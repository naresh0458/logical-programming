//51. Write a java program to find second largest element in an array.

package javaprograms;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter array elements");
		int max=sc.nextInt();
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
			
		}
		
		System.out.println("second max is:" +smax);

	}

}
