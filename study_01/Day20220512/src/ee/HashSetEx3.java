package ee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// 중복 x, 순서 x
public class HashSetEx3 {
	public static void main(String[] args) {
		Set<Cars> set = new HashSet<Cars>();

		set.add(new Cars("Y201", "red"));
		set.add(new Cars("Y202", "blue"));
		set.add(new Cars("Y201", "red"));
		set.add(new Cars("Y201", "yellow"));
		set.add(new Cars("Y203", "black"));

		System.out.println("cnt : " + set.size());

		for (Iterator<Cars> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		for (Cars s : set)
			System.out.print(s + "\t");
	}
}

class Cars {
	private String model;
	private String color;

	public Cars(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Cars() {
	}
	
	@Override
	public String toString() {
		return model + ", " + color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, color);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.model == ((Cars)obj).model && this.color == ((Cars)obj).color)
			return true;
		else
			return false;
	}
}