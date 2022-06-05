package ezenen;

/*
 * E : Element 요소
 * K : Key 키
 * N : Number 넘버
 * T : Type 타입
 * V : Value 값
 */

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

public class MultiTypeParam {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20);
		System.out.println(box);
		
		box.set("Apple2", new Integer(50));
		System.out.println(box);
	}

}
