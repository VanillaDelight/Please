
class Circle extends Shape{
	private double r;
	
	public Circle() {}
	public Circle(double r) {
		this.r = r;
	}
	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	private double width, height;
	
	public Rectangle() {
		this(new Point(0, 0), 0, 0);
	}
	public Rectangle(double width, double height) {
		this(new Point(0, 0), width, height);
	}
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare(double width, double height) {
		width = this.width;
		height = this.height;
		if (width == height) {
			return true;
		} else {
			return false;
		}
	}
}

abstract class Shape {
	Point p;
	

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Exercise7_22 {
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10, 7), 7);
		Shape s3 = new Circle(5);
		System.out.println("dd");
		System.out.println(s2.calcArea());
		
		Rectangle r = new Rectangle(5, 5);
		System.out.println(r.calcArea());
		System.out.println(r.isSquare(0, 0));
	}
}