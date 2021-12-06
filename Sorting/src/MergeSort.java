import java.util.Scanner;

public class MergeSort {
	
     void mergesort(int arr[],int l,int mid,int h) {
    	 int n1=mid-l+1;
    	 int n2=h-mid;
    	 int L[]=new int[n1];
    	 int R[]=new int[n2];
    	 
    	 for(int i=0;i<n1;i++)
    		 L[i]=arr[l+i];
    	 for(int j=0;j<n2;j++)
    		 R[j]=arr[mid+1+j];
    	 int i=0,j=0,k=l;
    	 while(i<n1&&j<n2) {
    		 if(L[i]<R[j]) {
    			 arr[k]=L[i];
    			 i++;
    		 }
    		 else {
    			 arr[k]=R[j];
    			 j++;
    		 }
    		 k++;
    	 }
    	 while(i<n1) {
    		 arr[k]=L[i];
    		 i++;
    		 k++;
    	 }
    	 while(j<n2) {
    		 arr[k]=R[j];
    		 j++;
    		 k++;
    	 }
     }
	
	
	void sort(int arr[],int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,h);
			mergesort(arr,l,mid,h);
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
		MergeSort m=new MergeSort();
		m.sort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
}
}