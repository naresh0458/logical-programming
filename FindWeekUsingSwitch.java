//16. Write a java program to print day of week name using switch case.
package javaprograms;

import java.util.Scanner;

public class FindWeekUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter week number");
		int weeknum=sc.nextInt();
		switch(weeknum) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("Enter correct week number");
		}

	}

}
