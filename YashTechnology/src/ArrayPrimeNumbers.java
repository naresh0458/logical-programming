import java.util.Scanner;

public class ArrayPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int [] arr=new int[s];
		int count=0;
		
		System.out.println("Enter the elements into array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			count=0;
		for(int j=1;j<=arr[i];j++) {
			if(arr[i]%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(arr[i]+" ");
		}
		
	}
	}

}
