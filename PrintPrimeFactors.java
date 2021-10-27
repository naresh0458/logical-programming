//42. Write a java program to find all prime factors of a number.
package javaprograms;

import java.util.Scanner;

public class PrintPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number=");
		int num=sc.nextInt();
		int count=0;
		System.out.print("The Factors Of "+num+" = ");
		for(int i=2;i<=num/2;i++){
			if(num%i==0) {
				//System.out.print(i+" ");  
				
				for(int j=1;j<=i/2;j++) {
					
					if(i%j==0) {
						count++;
					}
				}
				if(count==1) {
					System.out.print(i+" ");
				}
				count=0;
			}
		}
		
}
}

