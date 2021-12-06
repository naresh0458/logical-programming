import java.util.Scanner;

class Node {
int data;
Node next;
}

public class Runner{
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(40);
		list.insert(66);
		list.insert(75);
		list.remove();
		list.show();
		
	}
}


class LinkedList {
	
	Node head;
    
public void insert(int data) {
	
Node node=new Node();
node.data=data;
node.next=null;
if(head==null) {
	head=node;
}
else {
	Node n=head;
	while(n.next!=null) {
		n=n.next;
	}
	n.next=node;
}

}

public void remove() {
	Node node=new Node();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element  to delete");
	int n=sc.nextInt();
	Node c= head;
	Node p;
	while(c.data==n) {
		c=c.next;
	}
	c.next=node;
}











public void show() {
 Node node=head;
 while(node.next!=null) {
	  System.out.println(node.data);
	  node=node.next;
 }
 System.out.println(node.data);
}
}
