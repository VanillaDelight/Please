import java.util.Scanner;

/* 주사위 2개를 던진다
 * 1,2
 * 4,5
 * 6,6
 * 3,2 ==> 두수의 합이 5가 되면 종료.
 */
public class DiceGame {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int twice = 0;
		int sum;
		int count = 0;
		
		do {
			System.out.println("주사위를 던집니다.");
			Thread.sleep(1500);
			
//			first = sc.nextInt();
			first = (int)((Math.random() * 6)) + 1;
			twice = (int)((Math.random() * 6)) + 1;
			sum = first + twice;
			
			System.out.println("첫번째 주사위는 " + first + "입니다!");
			Thread.sleep(1500);
			System.out.println("두번째 주사위는 " + twice + "입니다!");
			Thread.sleep(1500);
			System.out.println("두 수의 합은 " + sum + "입니다.");
			Thread.sleep(1500);
			count++;
		} while (sum != 5);
		
		System.out.println("두 수의 합이 " + sum + "이 되었으므로 종료합니다. \n횟수 : " + count);
		
		
	}

}
