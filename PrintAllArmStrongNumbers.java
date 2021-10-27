//44. Write a java program to print all Armstrong numbers between 1 to n.
package javaprograms;

import java.util.Scanner;

public class PrintAllArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;double sum=0;
		int number,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value=");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++) {
        sum=0;
        count=0;
         temp=i;
        	while(temp!=0) {
        		int c=temp%10;
        		count++;
        		temp=temp/10;
        	}
        	number=i;
        	while(number>0) {
        		int b=number%10;
        		sum=sum+(Math.pow(b,count));
        		number=number/10;
        	}
        	if(sum==i)
        		System.out.print(i+" ");
        	
        	}
        } 
        
        
	}


