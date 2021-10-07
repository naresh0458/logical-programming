package javacoding;

import java.util.Scanner;

public class FindMax {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year");
		int a=sc.nextInt();
		if(a%100==0 && a%400!=0) {
			System.out.println(a +" is not leap year");
		}
		
				else
		{
			System.out.println(a +" is leap year");
		}
}
}


