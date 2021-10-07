package javaprograms;

class A {
	int i;
	int j;
	A(){
		i=1;
		j=2;
	}
}
public class Memory{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 A obj1=new A();
		 A obj2=new A();
		 System.out.println(obj1.equals(obj2));
		 
	}

}
