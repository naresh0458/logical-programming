package practice;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		int min=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.print("enter array elements");
		a[0]=s.nextInt();
		min=a[0];
        for(int i=1;i<a.length;i++)
        {
        	
        	a[i]=s.nextInt();
       
        	if(a[i]<min) {
        		min=a[i];
        	}
        }
        
        System.out.println("The smallest element in array is :"+min);
	}

}
