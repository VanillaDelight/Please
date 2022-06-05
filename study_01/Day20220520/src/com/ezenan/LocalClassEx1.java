package com.ezenan;


interface Printable22 {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { con = s; }
	
	public Printable22 getPrinter() {

		class Printer implements Printable22 {
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}
}

public class LocalClassEx1 {

	public static void main(String[] args) {
		Papers p = new Papers("HEoo");
		Printable22 prn = p.getPrinter();
		prn.print();
	}

}
