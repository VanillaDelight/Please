import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int num = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 숫자를 5개 입력하세요.");
		
		for (int i = 1; i <= 5; i++) {
			
			num = sc.nextInt();
			
			if (0 > num || num > 100) {
				System.out.println("0 ~ 100 사이의 숫자만을 입력하세요.");
				i--;
			} else
				if (max < num)
					max = num;
		}
		
		System.out.println("최대값은 : " + max);
	}
}

