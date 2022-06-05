package ezenen.copy.copy.copy.copy.copy.copy.copy;

import javax.print.DocFlavor.STRING;

class Box<T> {
	protected T ob;
	public T getOb() { return ob; }
	public void setOb(T ob) { this.ob = ob; }
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class UnBoxer {
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
	
	public static <T> void peekBox(Box<? super Integer> box) { // 와일드카드 하한제한
		System.out.println(box);
	}
}

public class WildcarUnBoxer {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
		System.out.println(box.getOb());
		UnBoxer.peekBox(box);
		
		Box<Number> box2 = new Box<>();
		box2.setOb(12.3);
		UnBoxer.peekBox(box2);
		
		Box<Object> box3 = new Box<>();
		box3.setOb("String");
		UnBoxer.peekBox(box3);
	}

}
