package ezen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy", "box", "robot");
		// 초기화 할수있는건 좋은데, 수정이 어려움.
		
		list = new ArrayList<String>(list);
		list.add("car");
		System.out.println(list);
		
		java.util.ListIterator<String> it = list.listIterator(); // 양방향 거의안씀
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "\t");
		}
		System.out.println("\n-------------");
		while(it.hasPrevious()) {
			String str = it.previous();
			System.out.print(str + "\t");
		}
		System.out.println("\n-------------------");
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
	}

}
