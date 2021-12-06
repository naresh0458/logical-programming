import java.util.Scanner;

public class HighFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String str=sc.nextLine();
        
        int j=0,i=0;
        char c=' ';
        char ch[]=str.toCharArray();
        int high=0,count=1;
        for(i=0;i<ch.length;i++) {
        	for(j=i+1;j<ch.length;j++) {
        		if(ch[i]==ch[j]) {
        			ch[j]=' ';
        			
        			count++;
        		}
        		
        		}
        	if(high<count&&ch[i]!=' ') {
        		high=count;
    			c=ch[i];
        	}
        	count=1;	
        }
        System.out.println(c+" "+high);
    	

	}

}
