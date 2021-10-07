//78. Write a C program to read file contents and display on console.
package javaprograms;

import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			FileReader fr=new  FileReader("example1.tx");
			int ch=0;
			while((ch=fr.read())!=-1) {
				System.out.print((char) ch);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}
