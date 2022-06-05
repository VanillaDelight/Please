package ee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(3, "Kim");
		map.put(4, "Lee");
		map.put(4, "Hong");
		map.put(5, "Park");
		map.put(6, "kim");
		
		System.out.println(map);
		System.out.println(map.get(4));
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Set<Integer> set = map.keySet();
		
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		
		System.out.println("\n--------------");
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next()) + " ");
	}
}
