import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int s=sc.nextInt();
		int temp=0;
		int []arr=new int[s];
		System.out.println("Enter the elemets");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
