package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {

//	@Autowired
//	@Qualifier("appleSpeaker")
	@Resource(name="sony")
	private Speaker speaker;
	
	private int price;

	public SamsungTV() {
		System.out.println("Samsung TV 생성자(default)");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("Samsung TV 생성자(1개)");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("Samsung TV 생성자(2개)");
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
		System.out.println("Samsung TV 켜짐!!!!!!!!!");
		System.out.printf("가격 : %d\n", price);
	}

	public void powerOff() {
		System.out.println("Samsumg TV 전원꺼짐");
	}

	public void volumeUp() {
//		System.out.println("Samsung TV 소리 올린다.");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
//		System.out.println("Samsung TV 소리 내린다.");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

//	void AAA() {
//		System.out.println("AAA 초기화 메서드");
//	}
//	void BBB() {
//		System.out.println("BBB 소멸전 메서드");
//	}
}
