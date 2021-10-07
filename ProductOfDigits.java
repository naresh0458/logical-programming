//31. Write a C program to calculate product of digits of a number.
package javacoding;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rem=0,prd=1,num=45;
		while(num!=0) {
			rem=num%10;
			prd=prd*rem;
			num=num/10;
		}
		System.out.println("Product of digits is:" +prd);
		
	}

}
