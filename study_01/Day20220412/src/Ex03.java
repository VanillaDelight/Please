
public class Ex03 {

	public static void main(String[] args) {
		// 함수에서 입력 x 출력 o
		
		double drum = 2.5;
		int num2 = 5;
				
		System.out.println("main() 함수!!");
		
		
		int result = sub();
		
		System.out.println("결과 값은 " + result);
		
	}
	
	
	public static int sub() {
		int num = 10000;
		
		System.out.println("sub() 함수...");
		
		return num;
	}

}

