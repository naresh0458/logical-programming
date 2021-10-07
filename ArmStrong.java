//43. Write a C program to check whether a number is Armstrong number or not.
package javaprograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value=");
		int num=sc.nextInt();
		int rem=0;
		int count=0;
		int n=num;
		double sum=0;
		while(num!=0) {
			rem=num%10;
			count++;
			num=num/10;
			
		}
		int temp=n;
		while(temp!=0) {
			int d=temp%10;
			sum=sum+(Math.pow(d,count));
			temp=temp/10;
		
		}
		if(sum==n) {
		System.out.println(n +" is a Armstrong");
		}
		else {
			System.out.println(n +" is not a Armstrong");
		}

	}

}
