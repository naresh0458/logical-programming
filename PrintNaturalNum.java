package javaprograms;

import java.util.Scanner;

public class PrintNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			System.out.print(i+ " ");
			i++;
		}

	}

}
