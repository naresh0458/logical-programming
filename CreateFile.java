//77. Write a C program to create a file and write contents, save and close the file.
package javaprograms;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		    
		    System.out.print("enter String : ");
		    String str=scan.nextLine();
		    
		    try{
		        FileOutputStream fis=new FileOutputStream("abc.txt");
		        
		       byte b[]=str.getBytes();
		       
		       fis.write(b);
		       fis.flush();
		       //fis.close();
		       
		    }
		    catch(Exception e){
		        System.out.println(e);
		    }
		}
	}	