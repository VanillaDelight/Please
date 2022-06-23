package polymorphism;


public class SonyTV implements TV {
	public SonyTV() {
		System.out.println("Sony");
	}
	public void powerOn() {
		System.out.println("Sony TV 켜짐!!!!!!!!!");
	}
	public void powerOff() {
		System.out.println("Sony TV 전원꺼짐");
	}
	public void volumeUp() {
		System.out.println("Sony TV 소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("Sony TV 소리 내린다.");
	}
}
