package javaprograms;

import java.util.Scanner;

public class FindMaxAndSecondMax {

	public static void main(String[] args) {
		int max=0,smax=0,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");       // 34 23 67 44 66
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			num=s.nextInt();
			if(max<num) {                  // 67<66
				smax=max;                 // smax=66
				max=num;                  // max=67
			}
			else if(smax<num) {
				smax=num;
			}
			
		}
		
		System.out.println("MAX: "+max);
		System.out.println("sMAX: "+smax);
		
		}

	}


