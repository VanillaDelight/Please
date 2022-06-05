package inner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Printable22 {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { con = s; }
	public Printable22 getPrinter() { return new Printer2(); }
	
	private class Printer implements Printable22 {

		@Override
		public void print() { System.out.println("흑 : " + con); }
		
	}
	private class Printer2 implements Printable22 {

		@Override
		public void print() { System.out.println("백 : " + con); }
		
	}
	
}

public class UseMemberEx1 {
	public static void main(String[] args) {
		Papers p = new Papers("HEoo");
		Printable22 prn = p.getPrinter();
		prn.print();
		
		List<String> list = new ArrayList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		Iterator it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
