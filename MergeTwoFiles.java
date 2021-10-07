//81. Write a C program to merge two file to third file.
package javaprograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MergeTwoFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		try {
			
			FileReader fr1=new  FileReader("file1.txt");
			FileReader fr2=new FileReader("D://naresh/files/file1.txt");
			FileWriter fw=new FileWriter("example1.txt");
			int ch=0;
			while((ch=fr1.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			while((ch=fr2.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			fw.flush();
			
			System.out.println("sucessfully inserted");
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}