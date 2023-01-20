package oops;

public class Hierarchical {
void add(int a,int b) {
	int c = a+b;
	System.out.println(c);
}
}
class b extends Hierarchical{
	void sub (int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
}
class c extends Hierarchical  {
	void mul (int a,int b) {
		int c=a*b;
		System.out.println(c);
	}

}
class test{
	public static void main(String[] args) {
		c ob = new c();
		ob.add(10, 20);
		ob.mul(10, 20);
		
		
	}
	}