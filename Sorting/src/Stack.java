
import java.util.Scanner;

public class Stack {
	static int size;
	int top=-1;
	static int stack[];
	
	static {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int s=sc.nextInt();
		stack=new int[s];
	}
	void push(int ele) {
		if(top==stack.length-1) {
			System.out.println("\nstack is full");
		}
		else {
			System.out.println("\nele in stk");
			stack[++top]=ele;
			print();
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("\nstack is empty");
		}
		else {
			System.out.println("\nremoved element is"+stack[top]);
			top--;
			print();
		}
	}
	void print() {
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(75);
		s.push(45);
		s.push(30);
		s.push(12);
		s.pop();
		s.pop();
		
		
       
	}

}
