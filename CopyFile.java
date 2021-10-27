//80. Write a java program to copy contents from one file to another file.
package javaprograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		try {
			
			FileReader fr=new  FileReader("file1.txt");
			FileWriter fw=new FileWriter("D://naresh/files/file2.txt");
			int ch=0;
			while((ch=fr.read())!=-1) {
				//System.out.print((char) ch);
				fw.write(ch);
			}
			
			fw.flush();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}
}
