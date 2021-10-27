package javaprograms;

import java.util.Scanner;

public class FindMaxAndSecondMax {

	public static void main(String[] args) {
		int max=0,smax=0,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");      
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			num=s.nextInt();
			if(max<num) {                 
				smax=max;                 
				max=num;                  
			}
			else if(smax<num) {
				smax=num;
			}
			
		}
		
		System.out.println("MAX: "+max);
		System.out.println("sMAX: "+smax);
		
		}

	}


