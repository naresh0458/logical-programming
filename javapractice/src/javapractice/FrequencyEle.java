//57. Write a C program to count frequency of each element in an array.
package javapractice;

import java.util.Scanner;

public class FrequencyEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;int high=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
int s=sc.nextInt();
int arr[]=new int[s];
System.out.println("Enter elements:");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++) {
	
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			arr[j]=0;
			count++;
		}
	}
	
	if(count>0&&arr[i]!=0) {
		
		
	System.out.println(arr[i]+" frequency: " +count);}
	count=0;
}
		
		
	}

}
