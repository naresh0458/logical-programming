//15. Write a java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill
     
     
package javaprograms;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your electricity units");
		double units=sc.nextDouble();
		if(units<=50) {
			double bill=units*0.50;
			System.out.println("Total electricity bill is:" +bill);
		}
		else if(units<=150)
		{
			double bill=50*0.50+(units-50)*0.75;
			System.out.println("Total electricity bill is:" +bill);
		}
		else if(units<=250)
		{
			double bill=50*0.50+100*0.75+(units-150)*1.20;
			System.out.println("Total electricity bill is:" +bill);
		}
		else {
			double bill=50*0.50+100*0.75+100*1.20+(units-250)*1.50;
			bill=bill+((20*bill)/100);
			System.out.println("Total electricity bill is:" +bill);
		}
		
	}

}
