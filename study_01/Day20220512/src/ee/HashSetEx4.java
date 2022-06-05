package ee;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx4 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		int jo = (int)(Math.random() * 6) +1;
		set.add(jo);
		System.out.print(jo + "조 : ");
		for(int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 10);
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
