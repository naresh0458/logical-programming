package practice;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		String str1 []=str.split(" ");
		String rev="";
		int count=0;
		System.out.print("Reverse words are: ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(rev+str1[i]+" ");
		}
		System.out.println("length of string is");
		for(int i=0;i<str1.length;i++) {
			System.out.print(str1[i]+": "+str1[i].length()+" ");
			for(int j=0;j<str1[i].length();j++) {
				char ch=str1[i].charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					
				}
			}
		      
		
		}
		
		
		
		
		
	}

}
