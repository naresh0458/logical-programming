//26. Write a java program to count number of digits in a number.
package javacoding;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,num=45780569;
     
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		
		System.out.println("number of digits in a number:" +count);
		
	}

}
