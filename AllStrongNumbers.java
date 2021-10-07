package javaprograms;

import java.util.Scanner;

public class AllStrongNumbers {

	public static boolean strongNumber(int n){
		int fact,rem,i;
		
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
		i = 1;
		fact = 1;
		rem = n % 10;

		while(i <= rem)
		{
		fact = fact * i;
		i++;
		}
		sum = sum + fact;
		n = n / 10;
		}

		if(sum == temp)
		return true;
		else
		return false;

		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your n value=");
		int num=sc.nextInt();
		
        for(int i=1;i<=num;i++)
        	if(strongNumber(i)==true) {
        		System.out.println(i+" ");
        	}
	}
	

}
