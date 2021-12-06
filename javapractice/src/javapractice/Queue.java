package javapractice;

import java.util.Scanner;

public class Queue {
	static int f=0,r=0,c=0,size;
	    int Que[]=new int[size];

	    static {
	    	Queue  q=new Queue ();
	        q.insert();
	    }

	    void insert() {
	        Scanner s=new Scanner(System.in);

	        System.out.println("Enter Size of queue: ");
	        int size=s.nextInt();
	        this.size=size;
	    }

	    void add(int val) {

	        if(c==Que.length-1) {
	            System.out.println("Queue is Full");
	        }
	        else {
	            Que[r]=val;
	            r++;
	            c++;
	            System.out.println("\nelements in Queue");
	            print();
	        }
	    }

	    void remove() {

	        if(c==0) {
	            System.out.println("Queue is Empty");
	        }
	        else {
	            System.out.println("\nremove element is"+Que[f]);
	            f++;
	            c--;
	            System.out.println("\nelements in Queue");
	            print();
	        }
	    }

	    void print() {
	        for(int i=f;i<r;i++) {
	            System.out.print(Que[i]+" ");
	        }
	    }

	    public static void main(String args[]) {



	        Queue q=new Queue ();
	       

//        q.size=size;

	        q.add(55);
	        q.add(25);
	        q.add(65);
	        q.add(90);
	        q.remove();
	        q.remove();
	        q.add(80); 
	        q.remove();
	       

	    }

	}