//19. Write a java program to print all alphabets from a to z. - using while loop
package javaprograms;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet");
		char ch=sc.next().charAt(0);
	 char i=ch;
		while(i<='z') {
			System.out.print(i +" ");
			i++;
		}
	}

}
