import java.util.Scanner;

// 일 월 화 수 목 금 토 일 --> 이 중 하나가 나오면 그에 맞는 소문자로 요일 입력

public class Day {

	public static void main(String[] args) {

		String[] Eng_day = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		String[] Kor_day = { "일", "월", "화", "수", "목", "금", "토" };

		Scanner sc = new Scanner(System.in);

		System.out.println("해당 요일의 영어단어를 입력하세요.");
		System.out.println("모두 소문자로 입력");

		int retry = 1;
		int DayOfWeek;
		int last = -1;
		int good = 0;
		int bad = 0;
		
		do {
			
			do {
				DayOfWeek = (int) (Math.random() * 7);
			} while (DayOfWeek == last);
			last = DayOfWeek;

			while (true) {
				System.out.print(Kor_day[DayOfWeek] + "요일 : ");
				String answer = sc.nextLine();

				if (answer.equals(Eng_day[DayOfWeek]))// || (answer.equals("1")))
					break;
				bad++;
				System.out.println("오답입니다. 다시 입력하세요. 정답 : " + good + " 틀린 횟수 : " + bad);
			}
			good++;
			System.out.println("정답입니다.  정답 : " + good + " 틀린 횟수 : " + bad + "\n다시(1), 종료(0)");
			

			retry = sc.nextInt();
			sc.nextLine(); // 엔터 제거용
			
		} while (retry == 1);
		System.out.println("끝");
		System.out.println("총 정답 : " + good + "번, 틀린 횟수 : " + bad + "번 입니다.");

	}


}