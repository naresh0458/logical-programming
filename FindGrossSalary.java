package javaprograms;

import java.util.Scanner;

public class FindGrossSalary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic salary");
		double salary=sc.nextDouble();
		if(salary<=10000) {
			double HRA=((salary*20)/100);
			double DA=((salary*80)/100);
			System.out.println("HRA is:" +HRA);
			System.out.println("DA is:" +DA);
			System.out.println("Total Gross Salary is:" +(salary+HRA+DA));
		}
		else if(salary<=20000)
		{
			double HRA=((salary*25)/100);
			double DA=((salary*90)/100);
			System.out.println("HRA is:"+HRA);
			System.out.println("DA is:" +DA);
			System.out.println("Total Gross Salary is:" +(salary+HRA+DA));
		}
		else {
			double HRA=((salary*30)/100);
			double DA=((salary*95)/100);
			System.out.println("HRA is:" +HRA);
			System.out.println("DA is:" +DA);
			System.out.println("Total Gross Salary is:" +(salary+HRA+DA));
		}
	}

}
