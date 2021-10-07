//57. Write a java program to count frequency of each element in an array.
package javaprograms;

import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter number:");
        int fr=1;
         for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
         }
        for(int i=0;i<arr.length;i++){
           
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                    fr++;
                }
            }
           if(arr[i]!=0){
          System.out.println(arr[i]+"  frequency: "+fr);  
        } 
        fr=1;
        }
        
  	}
  }	
