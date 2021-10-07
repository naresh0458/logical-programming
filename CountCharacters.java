//82. Write a C program to count characters, words and lines in a text file.
package javaprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);
		
		try {
			
			BufferedReader fr=new BufferedReader(new FileReader("example2.txt"));
			String str1 = fr.readLine();
			int ch=0;
			int alpa=0;
			int line=0;
			//String str=null;
			while(str1!=null) {
				line++;
				String str[] = str1.split(" ");
				alpa = alpa + str.length;
				for(String w: str) {
					ch = ch +w.length();
				}
				str1=fr.readLine();
			}
//			while((ch=fr.read())!=-1) {
//				//System.out.print((char) ch);
//				if(((char)ch>='A' && (char)ch<='Z') || ((char)ch>='a' && (char)ch<='z')){
//					alpa++;
//				}
//				
//				
//			}
//			
			
			System.out.println("Number of characters :"+ch);
			System.out.println("Number of lines :"+line);
			System.out.println("Number of lines :"+alpa);
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}