package Lambda;

interface Printable3 { void print(String s); }


public class Lambda3 {

	public static void main(String[] args) {
		Printable3 prn = (s) -> System.out.println(s); // 이것이 람다다 !
		
		prn.print("ekekekekekekeksssssdfsdfsdfsdfsdfsdfsfaffxv");
	}

}
