//90. WAP to print reverse case of a given string
package javaprograms;

import java.util.Scanner;

public class Example90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);   
        System.out.println("enter a string : ");
        String str1=scan.nextLine();
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            
            if(Character.isLowerCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
                
            else if(Character.isUpperCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}     
