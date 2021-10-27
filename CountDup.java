//59. Write a java program to count total number of duplicate elements in an array.
package javaprograms;

import java.util.Scanner;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
		    System.out.println("enter size:"); 
		    int size=scan.nextInt();
		    
	       int arr[]=new int[size];
	       
	        System.out.println("enter array elements:");
	       for(int i=0;i<size;i++){
	           
	           arr[i]=scan.nextInt();
	       }
	       int fr=0;
	       for(int i=0;i<size;i++){
	           for(int j=i+1;j<size;j++){
	             if(arr[i]==arr[j]){
	                 arr[j]=0;
	                 fr++;
	             }    
	           }
	           if(fr!=0 && arr[i]!=0){
	               System.out.println(arr[i]+" is a duplicate element  "+fr);
	           }
	           fr=0;
	           
	       }
		}
	}	
