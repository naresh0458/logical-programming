package practice;

import java.util.Scanner;

public class TwoArraysum {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter size of first array");
	int size1=s.nextInt();
	int a1[]=new int[size1];
	System.out.println("enter first array elements");
for(int i=0;i<a1.length;i++)
{
	a1[i]=s.nextInt();
}
System.out.println("enter size of second array");
int size2=s.nextInt();
int a2[]=new int[size2];
System.out.println("enter second array elements");
for(int i=0;i<a2.length;i++)
{
a2[i]=s.nextInt();
}
int a3[]=new int[size1];
for(int i=0;i<a3.length;i++)
{
	a3[i]=a1[i]+a2[i];
}
for(int i=0;i<a3.length;i++)
{
System.out.print(a3[i]+" ");
}
	}

}
