package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("Sony Speaker 생성자");
	}
	
	public void volumeUp() {
		System.out.println("Sony Speaker ..소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("Sony Speaker ..소리 내린다.");
	}
}
