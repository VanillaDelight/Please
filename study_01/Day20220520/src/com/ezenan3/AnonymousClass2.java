package com.ezenan3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("robot");
		list.add("apple");
		list.add("toy");
		list.add("vegetable");
		
		System.out.println(list);
		
		System.out.println("------------------");

		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("------------------");

		Comparator<String> cmp = new Comparator<String>() {
			// 인터페이스여서 몸통이있어야 생성가능..
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		Collections.sort(list, cmp);
		System.out.println(list);
	}

}
