import java.util.Scanner;

public class PrintFrequency {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int count=1;
	
		int [] arr=new int[s];
		System.out.println("Enter the elements into array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					count++;
					arr[j]=0;
				}
			}
			if(count>=1&&arr[i]!=0) {
				System.out.println(arr[i]+" "+count);
			}
			count=1;
		}

	}

}
