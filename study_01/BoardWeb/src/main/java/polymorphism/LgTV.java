package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	
	private Speaker speaker;
	
	private int price;

	public LgTV() {
		System.out.println("LgTV TV 생성자(default)");
	}

	public LgTV(Speaker speaker) {
		System.out.println("LgTV TV 생성자(1개)");
		this.speaker = speaker;
	}

	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV TV 생성자(2개)");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("LG TV 켜짐!!!!!!!!!");
		System.out.printf("가격 : %d\n", price);
	}

	public void powerOff() {
		System.out.println("LG TV 전원꺼짐");
	}

	public void volumeUp() {
		System.out.println("LG TV 소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("LG TV 소리 내린다.");
	}
}
