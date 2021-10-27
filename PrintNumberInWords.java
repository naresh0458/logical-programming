//34. Write a java program to enter a number and print it in words.
package javaprograms;

import java.util.Scanner;

public class PrintNumberInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String digitwords="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number=");
		int number=sc.nextInt();
		int rem=0;
		int num=number;
		while(num>0)
		{
			rem=num%10;
			switch(rem)
			{
			case 0:
				digitwords="Zero " +digitwords;
				break;
			case 1:
				digitwords="One " +digitwords;
				break;
			case 2:
				digitwords="Two " +digitwords;
				break;
			case 3:
				digitwords="Three " +digitwords;
				break;
			case 4:
				digitwords="Four " +digitwords;
				break;
			case 5:
				digitwords="Five " +digitwords;
				break;
			case 6:
				digitwords="Six " +digitwords;
				break;
			case 7:
				digitwords="Seven " +digitwords;
				break;
			case 8:
				digitwords="Eight " +digitwords;
				break;
			case 9:
				digitwords="Nine " +digitwords;
				break;
				
			}
			num=num/10;
		}
		System.out.println("digits=" + number);
		System.out.println("words=" + digitwords);
	}

}
