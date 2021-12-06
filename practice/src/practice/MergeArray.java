package practice;

import java.util.Scanner;

public class MergeArray {

	public static void sort(int a[]) {
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int s=sc.nextInt();
	System.out.println("Enter the size2");
	int s2=sc.nextInt();
	int []arr=new int[s];
	int []arr2=new int[s2];
	System.out.println("Enter the elements");
	int count=0;
	for(int i=0;i<s;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the elements");
	for(int i=0;i<s2;i++) {
		arr2[i]=sc.nextInt();
	}
	int l=arr.length+arr2.length;
	int mer[]=new int[l];
	for(int i=0;i<arr.length;i++) {
		mer[i]=arr[i];
		count++;
	}
for(int j=0;j<arr2.length;j++) {
	mer[count++]=arr2[j];
			
}

sort(mer);
for(int i=0,j=0;i<mer.length;i++) {
	System.out.print(mer[i]+" ");
}

	}

}
