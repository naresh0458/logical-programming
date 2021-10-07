//32. Write a C program to enter a number and print its reverse.
package javacoding;

public class ReverseTheNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int rem=0,reverse=0,num=459;
          while(num!=0) {
        	  rem=num%10;
        	  reverse=(reverse*10)+rem;
        	  num=num/10;
          }
		System.out.println("reverse number is:" +reverse);
	}

}
