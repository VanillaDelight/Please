package Lambda2;

@FunctionalInterface
interface Calculate<T> {
	T cal(T a, T b);
}

public class LambdaGeneric {

	public static void main(String[] args) {
		Calculate<Integer> c = (a, b) -> a + b;
		
		System.out.println(c.cal(12, 13));
		
		Calculate<Double> d = (a, b) -> a * b;
		
		System.out.println(d.cal(2d, 12d));
	}

}
