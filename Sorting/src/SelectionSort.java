import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int s=sc.nextInt();
		int temp=0,min=0;
		int []arr=new int[s];
		System.out.println("Enter the elemets");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
