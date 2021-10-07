package javacoding;

public class PrintSumOfFirstAndLastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//27. Write a C program to find first and last digit of a number.
				         int firstdigit=0,lastdigit=0,num=123456;
		         
		         lastdigit=num%10;
		         System.out.println("last digit is:" +lastdigit);
		         while(num!=0) {
		        	 firstdigit=num%10;
		        	 num=num/10;
		         }
		         System.out.println("first digit is:" +firstdigit);
		         System.out.println("first digit is:" +(firstdigit+lastdigit));
			}

		

	}


