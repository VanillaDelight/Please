
public class Ex04 {

	public static void main(String[] args) {
		// 함수에서 입력 o 출력 o
		
		System.out.println("main() 함수!!");
		int n = 5;
		int n2 = 10;
		int result = sub(n, n2);
		
		System.out.println("결과 값은 " + result);
		
	}
	
	
	public static int sub(int i, int j) {
		System.out.println("sub() 함수...");
		return (i * j);

	}

}
