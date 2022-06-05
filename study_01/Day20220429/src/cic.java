
public class cic {

	public static void main(String[] args) {
		
		C c = new C(10, 20, 30); 
		System.out.println(c.a + ", " + c.b + ", " + c.c);
	}

}

class A {
	int a;
	public A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b;
	public B(int a, int b) {
		super(a);
		this.b = b;
		
	}
}

class C extends B {
	int c;
	public C(int i, int j, int k) {
		super (i, j);
		this.c = k;
	}
}