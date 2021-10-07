//29. Write a C program to check whether a number is palindrome or not.
package javacoding;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123,rem=0,sum=0,temp=num;
	
		while(num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
if(temp==sum) {
	System.out.println("given number is palindrom");
}
else {
	System.out.println("given number in not a palindrom");
}
	}

}
