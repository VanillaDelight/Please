package Lambda;

interface Printable2 { void print(String s); }


public class Lambda2 {

	public static void main(String[] args) {
		Printable2 prn = new Printable2() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("123qewads");
	}

}
