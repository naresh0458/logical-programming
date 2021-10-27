//13. Write a java program to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
//    Percentage >= 90% : Grade A
//    Percentage >= 80% : Grade B
 //   Percentage >= 70% : Grade C
//    Percentage >= 60% : Grade D
//    Percentage >= 40% : Grade E
//    Percentage < 40% : Grade F

package javaprograms;

import java.util.Scanner;

public class FindPercentAndGrade {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the physics,chemistry,biology,mathematics,computer");
	double physics=sc.nextDouble();
	double chemistry=sc.nextDouble();
	double biology=sc.nextDouble();
	double mathematics=sc.nextDouble();
	double computer=sc.nextDouble();
	double percent=((physics+chemistry+biology+mathematics+computer)*100)/500;
	System.out.println("Total percentage is:" +percent+"%");
	if(percent>=90) {
		System.out.println("GRADE A");
	}
	else if(percent>=80) {
		System.out.println("GRADE B");
	}
	else if(percent>=70) {
		System.out.println("GRADE C");
	
	}
	else if(percent>=60) {
		System.out.println("GRADE D");

}
	else if(percent>=40) {
		System.out.println("GRADE E");
	}
	else
	{
		System.out.println("FAIL");
	}
}
}
