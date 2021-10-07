//86. WAP to print all Armstrong numbers between given interval using functions.
package javaprograms;

import java.util.Scanner;

public class Example86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 Scanner scan=new Scanner(System.in);

	      System.out.print("enter starting number: ");
	      int start=scan.nextInt();
	      
	      System.out.print("enter ending number: ");
	      int end=scan.nextInt();
	      
	      
	      int sum=0,count=0,number=1,rem=0;
	      
	      for(int k=start;k<=end;k++){
	          int temp=k;
	          int temp1=temp;
	         while(temp1!=0){
	             
	           temp1=temp1/10;
	           count++;
	          }
	         int last=temp; 
	         for(int i=1;i<=count;i++){
	           rem=temp%10;
	           temp=temp/10;
	           for(int j=1;j<=count;j++){
	             number=number*rem;
	            }
	            sum=sum+number;
	            number=1;
	         }
	         count=0;
	         if(sum==last){
	         
	         System.out.print(sum+" "); 
	         
	         }
	         sum=0;
	      }
	      
	      
		}
	}	