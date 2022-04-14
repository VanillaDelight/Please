import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		
		double result = add();
		
		System.out.println("두 수 평균은 " + result);
		System.out.println("프로그램 종료");
		
	}
	public static double add() {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		return (i + j) / 2.0;
	}
}
