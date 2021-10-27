//33. Write a java program to find frequency of each digit in a given integer.
package javacoding;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
      
        
        System.out.println("Enter any Number : ");
       int number=sc.nextInt();
       int digit;
         System.out.println("Digit\tFrequency");
        for(int i=0;i<=9;i++)
        {
           int count=0;
           int temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }  
            if(count>1)
            {
                System.out.println(i+"\t"+count);
            }
        }

		
		
	}

}
