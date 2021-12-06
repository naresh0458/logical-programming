import java.util.Scanner;

public class LowFrequency {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
		        String str=sc.nextLine();
		        
		        int j=0;
		        char ch[]=str.toCharArray();
		        int low=ch.length,count=0;
		        for(int i=0;i<ch.length;i++) {
		        	for(j=i+1;j<ch.length;j++) {
		        		if(ch[i]==ch[j]) {
		        			ch[j]=' ';
		        			count++;
		        		}
		        		
		        		}
		        	if(low>=count&&ch[i]!=' ') {
		        		low=count;
		    			System.out.println(ch[i]+" "+low);
		        	}
		        	count=0;	
		        }
		        
		            
		}

		}

	