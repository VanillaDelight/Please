package Lambda;

interface Printable5 { void print(String s); }

interface Calculate2{
	int cal(int n1, int n2);
}

//class Cal implements Calculate {
//
//	@Override
//	public void cal(int n1, int n2) {
//		System.out.println(n1 + n2);
//	}
//	
//}

class Cal2 implements Calculate2 {

	@Override
	public int cal(int n1, int n2) {
		return n1 * n2;
	}
	
}

public class Lambda5 {

	public static void main(String[] args) {
		
//		Calculate ca = new Cal();
//		ca.cal(1, 2);
		
		Calculate2 ce;
		
		ce = (n1, n2) -> { return n1 + n2; };
		System.out.println(ce.cal(21, 21));
		
		ce = (n1, n2) -> n1 * n2;
		System.out.println(ce.cal(21, 21));
		
//		ce = (n1, n2) -> return n1 + n2;  ==> 이건 안됨. 리턴을 없애던가 중괄호를 치던가
//		System.out.println(ce.cal(21, 21));
		
		Calculate2 se = new Cal2();
		System.out.println(se.cal(2, 4)); // 람다 안쓴것임..
		
		
		
		
		
		
		
		
		
		
		
		Printable4 prn;
		
		
		prn = (String s) -> { System.out.println(s); }; // 이것이 람다다 !
		prn.print("lambda1");

		prn = (String s) -> System.out.println(s); // 이것이 람다다 !
		prn.print("lambda2");
		
		prn = (s) -> { System.out.println(s); }; // 이것이 람다다 !
		prn.print("lambda3");
		
		prn = s -> { System.out.println(s); }; // 이것이 람다다 !
		prn.print("lambda4");
	}

}
