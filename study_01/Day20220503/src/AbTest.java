
public class AbTest {

	public static void main(String[] args) {
//		A a = new B();
		B a = new B();
		System.out.println(a.a);
		a.func();
	}

}

abstract class A { //추상 클래스임.
	int a = 10;
	void tset() {
		System.out.println("AAAAAAAAA");
	}
	abstract void func(); // 추상 메소드임.
}
class B extends A {
	void func() {
		System.out.println("BBBBBBBBBB");
	}
	
}
