package eee;

//class AppleBox {
//	private Apple ap;
//
//	public Apple getAp() {
//		return ap;
//	}
//
//	public void setAp(Apple ap) {
//		this.ap = ap;
//	}
//
//}
//
//class OrangeBox {
//	private Orange or;
//
//	public Orange getOr() {
//		return or;
//	}
//
//	public void setOr(Orange or) {
//		this.or = or;
//	}
//
//}

class Apple {
	@Override
	public String toString() {
		return "I'm apple";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I'm orange";
	}
}

class Box {
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

}

public class GenericsEx1 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());

		Apple ap = (Apple) aBox.getOb();
		System.out.println(ap);

		Orange or = (Orange) oBox.getOb();
		System.out.println(or);
		System.out.println("------------------");
		
		aBox.setOb(new Apple());
		oBox.setOb("orange");
		
		System.out.println(aBox.getOb());
		System.out.println(oBox.getOb());
		
	}

}
