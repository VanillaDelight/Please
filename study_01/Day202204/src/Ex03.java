import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int base = 1500;
		
		int age = (int) (Math.random() * 100 + 1);	

		
		if (4 <= age && age < 14) {
			System.out.printf("%d살의 버스요금은 %.0f원입니다.", age, base * 0.5);
		} else if (14 <= age && age < 20) {
			System.out.printf("%d살의 버스요금은 %.0f원입니다.", age, base * 0.75);
		} else if (20 <= age && age < 65) {
			System.out.printf("%d살의 버스요금은 %d원입니다.", age, base);
		} else
			System.out.printf("%d살의 버스요금은 %d원입니다.", age, base * 0);
		
	}

}
