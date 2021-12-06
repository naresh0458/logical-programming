package javapractice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
			    Scanner sc=new Scanner(System.in);  
			 
		      System.out.print("enter a number");
		      int num=sc.nextInt();
		      int s;
		      int sum=0;
		      for(int i=1;i<num;i++) {
		    	 s=i;
		      sum=0;
		    	  for(int j=1;j<i;j++) {
		    		  
		    	  
		    		  if(i%j==0) {
		    			  sum=sum+j;
		    		  }
		    	  }


		      if(s==sum) {
		    	  System.out.println(s+" ");
		      }
		     
		      
			}
		}
}

