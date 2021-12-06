import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String str=sc.nextLine();
        int count=1;
        int j=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	for(j=i+1;j<ch.length;j++) {
        		if(ch[i]==ch[j]) {
        			ch[j]=' ';
        			count++;
        		}
        		
        		}
        	if(count>=1&&ch[i]!=' ') {
    			System.out.println(ch[i]+" "+count);
        	}
        	count=1;	
        }
        
            
}

}
