package javacoding;

import java.util.Scanner;

public class FindWeekDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter week number");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println(a +" is monday");
		}
		else if(a==2) {
			System.out.println(a +" is tuesday");
		}
		else if(a==3) {
			System.out.println(a + " is wednesday");
		}
		else if(a==4) {
			System.out.println(a + " is thursday");
		}
		else if(a==5) {
			System.out.println(a + " is friday");
		}
		else if(a==6) {
			System.out.println(a + " is saturday");
		}
		else if(a==7) {
			System.out.println(a + " is sunday");
		}
		else
		{
			System.out.println(a + " is not a week number");
		}
	}

}
