import java.util.Scanner;

public class NonRepeatChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=0;
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j]) {
    			   count++;
    			   arr[j]=' ';
    		   }
    	   }
    	   if(count==0&&arr[i]!=' ') {
    		   System.out.print(arr[i]+" ");
    	   }
    	   count=0;
       }
	}

}
