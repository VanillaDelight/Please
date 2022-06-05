package ee;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(6);
		
		for(Integer n : tree)
			System.out.print(n + "\t");
		System.out.println("\n-----------------------");
		Iterator<Integer> it = tree.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}
}
