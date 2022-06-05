package Lambda;

interface Printable4 { void print(String s); }

interface Calculate {
	void cal(int n1, int n2);
}

//class Cal implements Calculate {
//
//	@Override
//	public void cal(int n1, int n2) {
//		System.out.println(n1 + n2);
//	}
//	
//}

public class Lambda4 {

	public static void main(String[] args) {
		
//		Calculate ca = new Cal();
//		ca.cal(1, 2);
		
		Calculate ce;
		
		ce = (n1, n2) -> System.out.println(n1 + n2);
		ce.cal(21, 21);
		
		
		
		
		
		
		
		
		
		
		
		
		
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
