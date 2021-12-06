package practice;

import java.util.Scanner;

public class MergeSortArray {

	public static void main(String[] args) {
        int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of first array");
		int size=s.nextInt();
		int a1[]=new int[size];
		int a2[]=new int[size];
		System.out.println("enter first array elements");
       for(int i=0;i<a1.length;i++)
       {
    	   a1[i]=s.nextInt();
       }
       for(int i=0;i<a2.length;i++)
       {
    	   a2[i]=s.nextInt();
       }
       for(int i=0;i<a1.length;i++)
       {
    	   for(int j=i+1;j<a1.length;j++)
    	   {
    		   if(a1[i]<a1[j])
    		   {
    			   temp=a1[i];
  
    		   }
    	   }
       }
       
	}

}
