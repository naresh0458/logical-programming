//84. WAP to find all prime numbers between given interval using     functions.
package javaprograms;

import java.util.Scanner;

public class Example84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

	      System.out.print("enter starting number : ");
	      int start=scan.nextInt();
	      
	      System.out.print("enter ending number : ");
	      int end=scan.nextInt();
	      
	       for(int i=start;i<end;i++){
	           int count=0;
	           for(int j=1;j<=i;j++){
	               if(i%j==0){
	                   count++;
	               }
	           }
	           if(count==2){
	               System.out.println(i+" ");
	           }
	       }
		}
	}	