package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("Apple Speaker 생성자");
	}
	
	public void volumeUp() {
		System.out.println("Apple Speaker ..소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("Apple Speaker ..소리 내린다.");
	}
}
