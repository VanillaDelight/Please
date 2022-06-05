package LGSamsung;

public class LGTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LGTV.. 전원On");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV.. 전원Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LGTV.. 소리Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LGTV.. 소리Down");
	}

}
