package com.ezen;

public class CarTest {

	public static void main(String[] args) {

//		Sedan se = new Sedan();
//		se.setColor("red");
//		System.out.println(se.getColor());
//		se.setPassenger(4);
//		System.out.println(se.getPassenger());
//
//		Sedan se2 = new Sedan("blue", 2, 4, 3);
//		System.out.println(se2.getPassenger());
//
		Sports sp = new Sports();
//		sp.setColor("yellow");
//		System.out.println(sp.getColor());
//
//		Sports sp2 = new Sports("gray", 2, 4, 1, 5000);
//		System.out.println(sp2.getHorsepower());
//		se2.run();
//		sp2.run();
		Sports sp3 = new Sports();
		sp.setColor("red");
		sp.setHorsepower(50);
		System.out.println(sp.getColor());
		System.out.println(sp.getHorsepower());
	}

}

class Car {
	private int passenger;
	private int tire;
	private int seat;

	public Car() {
		System.out.println("car");
	}

	public Car(int passenger, int tire, int seat) {
		System.out.println("Car() 생성자");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	void run() {
		System.out.println("달료!!!!");
	}

	void stop() {
	}
}

class Sports extends Sedan {

	private int horsepower;

	Sports() {
		System.out.println("sports");
	}

	Sports(String color, int passenger, int tire, int seat, int horsepower) {
		super(color, passenger, tire, seat);
		System.out.println("Sports() 생성자");
		this.horsepower = horsepower;
	}
	void run() {
		System.out.println("스포츠카 달료!!!!");
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
}

class Sedan extends Car {

	private String color;

	public Sedan() {
		System.out.println("sedan");
	}

	public Sedan(String color, int passenger, int tire, int seat) {
		super(passenger, tire, seat); // 상위클래스 생성자에게 전달..(Car생성자에게)
		System.out.println("Sedan() 생성자");
		this.color = color; // super은 항상 맨위에.

//		setPassenger(passenger);
//		setTire(tire);
//		setSeat(seat);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void gas() {
	}
}

class Bus extends Car {
	private int passengerCount;

	void passengerLoad() {
	}
}

class Truck extends Car {
	private int load;

	void opjectLoad() {
	}
}