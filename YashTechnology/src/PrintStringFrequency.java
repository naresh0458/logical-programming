import java.util.Scanner;

public class PrintStringFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=1;
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j]) {
    			   count++;
    			   arr[j]=' ';
    		   }
    	   }
    	   if(count>=1&&arr[i]!=' ') {
    		   System.out.println(arr[i]+" "+count);
    	   }
    	   count=1;
       }

	}

}
