package LGSamsung;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("SamsungTV.. 전원On");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV.. 전원Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV.. 소리Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV.. 소리Down");
	}
	
}
