package inner;

import inner.Outer.Nested1;
import inner.Outer.Nested2;

/*
 *	Nested클래스와 Inner클래스
 *	nested ==> static
 *
 *	Inner --> static xx
 *	Member inner class
 *	Local inner class
 *	Anonymous inner class
 */

class Outer {
	private static int num = 0;
	
	static class Nested1 {
		void add(int n) { num += n; }
	}
	
	static class Nested2 {
		int get() { return num; }
	}
}

public class StaticNested {

	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(10);
		Nested2 nst2 = new Nested2();
		System.out.println(nst2.get());
	}

}
