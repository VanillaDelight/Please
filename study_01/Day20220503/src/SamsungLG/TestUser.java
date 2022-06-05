package SamsungLG;

public class TestUser {

	public static void main(String[] args) {
		
		SamsungTV Stv = new SamsungTV();
		
		Stv.powerOn();
		Stv.powerOff();
		Stv.volumeUp();
		Stv.volumeDown();
		
		LGTV Ltv = new LGTV();
		
		Ltv.turnOn();
		Ltv.turnOff();
		Ltv.soundUp();
		Ltv.soundDown();
	}

}
