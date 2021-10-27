//46. Write a java program to print all Perfect numbers between 1 to n.
package javaprograms;

import java.util.Scanner;

public class PrintPerfectNumbers {
	
	        static boolean perfect(int num)
	        {
	            int sum = 0;
	            for(int i=1; i<num; i++)
	            {
	                if(num%i==0)
	                {
	                    sum = sum+i;
	                }
	            }
	            if(sum==num)
	                return true;
	            else
	                return false;
	        }
	        public static void main(String[] args)
	        {
	            Scanner obj = new Scanner (System.in);
	            System.out.println("enter the value for n");
	            int n = obj.nextInt();
	            for(int i=1; i<=n; i++)
	            {
	                if(perfect(i))
	                    System.out.println(i);
	            }
	        }
	 
	 
	}

	
