
public class Ex02 {

	public static void main(String[] args) {
		// 함수에서 입력 o 출력 x
		
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() 함수!!");
		
		sub(num, num2);
		
		System.out.println("main()2 함수");
		

	}
	public static void sub (int i, int j) {
		System.out.println("두 수 합은 " + (i + j));
	}
}
