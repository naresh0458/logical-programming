//20. Write a java program to print all even numbers between 1 to 100. - using while     loop
package javaprograms;

public class PrintEven {

	public static void main(String[] args) {
	int i=1;
	while(i<=100) {
		if(i%2==0) 
			System.out.print(i+" ");
			i++;
	}

	}

}
