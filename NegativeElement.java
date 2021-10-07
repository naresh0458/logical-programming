//50. Write a java program to print all negative elements in an array.
package javaprograms;

import java.util.Scanner;

public class NegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		int numbers[]=new int[n];
		System.out.print("Enter elements");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.print("negative elements are:");
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<0) {
				System.out.print(numbers[i]+" ");
		}
	
			
			}
			
		}
		
		
		
		
		
		
		
		
		
	}


