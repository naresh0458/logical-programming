import java.util.Scanner;

public class QuickSort {
	public int partision(int arr[],int l,int h) {
		int pivot=arr[l],p1=l+1,temp=0;
		for(int i=l+1;i<=h;i++) {
			if(arr[i]<pivot) {
				if(i!=p1) {
					temp=arr[p1];
					arr[p1]=arr[i];
					arr[i]=temp;
				}
				p1++;
			}
			
		}
		arr[l]=arr[p1-1];
		arr[p1-1]=pivot;
		
		
		return p1-1;
	}
	
	
	
	
	void sort(int arr[],int l,int h) {
		if(l<h) {
			int p=partision(arr,l,h);
			sort(arr,l,p);
			sort(arr,p+1,h);
		}
	}
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		QuickSort q=new QuickSort();
		q.sort(arr,0,arr.length-1); 
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
}

}
