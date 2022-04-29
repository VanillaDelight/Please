
public class CarTest {
	public static void main(String[] args) {
		
		Sedan se = new Sedan("white", 5, 4);
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		
		System.out.println(se.color + ", " + se.passenger + ", " + se.tire);
	}
}

class Car{
	int passenger;
	int tire;
	int seat;
	
	void run() {}
	void stop() {}
}

class Sedan extends Car{
	String color;
	
	public Sedan(String color, int passenger, int tire) {
		this.color = color;
		this.passenger = passenger;
		this.tire = tire;
		System.out.println("Sedan() 생성자");
	}
}

class Bus extends Car{
	void passengerLoad() {}
}

class Truck extends Car{
	void objectLoad() {}
}