package javaprograms;

import java.util.Scanner;

public class FindMinAndSecondMin {

	public static void main(String[] args) {
		int min=0,smin=0,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");       // 34 23 67 44 66
		int n=s.nextInt();
		min=s.nextInt();
		for(int i=2;i<=n;i++) {
			
			num=s.nextInt();
			if(min>num) {               
				smin=min;
				min=num;                  
			}
			else if(smin>num) {
				smin=num;
			}
			
			
		}
		
		System.out.println("Min: "+min);
		System.out.println("SMin: "+smin);
		
		}
		


	}


