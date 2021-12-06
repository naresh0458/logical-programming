import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int s=sc.nextInt();
		int key=0;
		int []arr=new int[s];
		System.out.println("Enter the elemets");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>key) {
					arr[j+1]=arr[j];
					arr[j]=key;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
