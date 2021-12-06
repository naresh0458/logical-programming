import java.util.Scanner;

public class SplitWord {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
      String rev="";
      int vow=0;
	String str=sc.nextLine();
	String str1[]=str.split(" ");
	for(int i=0;i<str1.length;i++) {
		for(int j=str1[i].length()-1;j>=0;j--) {
			rev=rev+str1[i].charAt(j);
		}
		rev=rev+" ";
	}
	System.out.println(rev);
	
	for(int i=0;i<str1.length;i++) {
		for(int j=0;j<str1[i].length();j++) {
			if(str1[i].charAt(j)=='a'||str1[i].charAt(j)=='e'||str1[i].charAt(j)=='i'||str1[i].charAt(j)=='o'||str1[i].charAt(j)=='u')
			{
				vow++;
			}
		}
		System.out.println(str1[i]+" "+vow);
		vow=0;
	}
	
	}

}
