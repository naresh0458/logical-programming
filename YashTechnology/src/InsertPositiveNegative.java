import java.util.Scanner;

public class InsertPositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int [] arr=new int[s];
		int pcount=0,nc=0;
		System.out.println("Enter the elements into array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>=0) {
				pcount++;
			}
			else {
				nc++;
			}
			
			}
		int [] parr=new int[pcount];
		int[] narr=new int[nc];
		pcount=0;
		nc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				parr[pcount]=arr[i];
				pcount++;
			}
			else {
				narr[nc]=arr[i];
				nc++;
			}
			
		}
		System.out.println("Positive array");
		for(int i=0;i<parr.length;i++) {
			System.out.print(parr[i]+" ");
		}
		System.out.println("\nNegitive array");
		for(int i=0;i<narr.length;i++) {
			System.out.print(narr[i]+" ");
		}
	}

}
