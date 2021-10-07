package javacoding;

import java.util.Scanner;

public class FindAlpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your character");
		char ch=sc.next().charAt(0);
		
		if(ch>='a'&&ch<='z')
		{
			System.out.println(ch + " is a lowercase");
		}
		else if(ch>='A'&&ch<='Z')
		{
			System.out.println(ch + " is a uppercase");
		}
		else
		{
			System.out.println(ch + " is not a alphabet");
		}
	}

}
