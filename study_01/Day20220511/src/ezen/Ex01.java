package ezen;

import java.util.LinkedList;
import java.util.List;


public class Ex01 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		
		for (String e : list)
			System.out.print(e + " ");
		System.out.println("\n----------------");
		
		
	}

}
