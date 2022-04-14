
public class Ex01 {

	public static void main(String[] args) {
		// 함수에서 입력 x 출력 x
		System.out.println("main() 함수!!");
		sub2();  //함수 호출
		
	}
	// 함수가 존재하면 반드시 다른 곳(main등에서) 호출을 해야한다.
	public static void sub() {
		System.out.println("서브 함수 입니다.");
	}
	public static void sub2() {
		sub();
	}
}
