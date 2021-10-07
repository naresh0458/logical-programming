package javacoding;

import java.util.Scanner;

public class FindNumberOfNotes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount");
		int a=sc.nextInt();
		if(a%100==0) {
			if(a>=2000) {
				int b=a/2000;
				a=a-(b*2000);
				System.out.println(2000 + " notes are:" + b);
			}
			if(a>=500) {
				int c=a/500;
				a=a-(c*500);
				System.out.println("500 notes are:" + c );
			}
			if(a>=200) {
				int d=a/200;
				a=a-(d*200);
				System.out.println("200 notes are:" +d);
			}
			if(a>=100) {
				int e=a/100;
				a=a-(e*100);
				System.out.println("100 notes are:" +e);
			}
			
		}
		else
		{
			System.out.println("Enter correct amount");
		}
	}

}
