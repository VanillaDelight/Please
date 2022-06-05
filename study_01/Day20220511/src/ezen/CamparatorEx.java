package ezen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CamparatorEx {

	public static void main(String[] args) {
		List<Point> point = new ArrayList<Point>();
		
		point.add(new Point(10, 20));
		point.add(new Point(50, 10));
		point.add(new Point(30, 30));
		
		Collections.sort(point);
		
		for (Point p : point)
			System.out.println(p);
		
	}

}

//class Point implements Comparable<Point> {
class Point implements Comparator<Point> {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x = " + x + ", y = " + y + "]";
	}
//	@Override
//	public int compareTo(Point o) {
//		return this.x - o.x;
//	}
	@Override
	public int compare(Point o1, Point o2) {
		return o1.y - o2.y;
	}
}