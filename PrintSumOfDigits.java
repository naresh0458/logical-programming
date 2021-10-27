//30. Write a java program to calculate sum of digits of a number.
package javacoding;

public class PrintSumOfDigits {
	
	public static void main(String args[])
	{
		int rem=0,sum=0,num=45897;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits is:" +sum);
		
		
		
	}
	
	
	

}
