package Lambda;

interface Printable { void print(String s); }

class Printer implements Printable2 {

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
}

public class Lambda1 {

	public static void main(String[] args) {
		Printable2 prn = new Printer2();
		prn.print("123qewads");
	}

}
