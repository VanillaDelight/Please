import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re = 0;

		System.out.println("그 해 경과 일수를 구한다.");

		do {

			System.out.println("년 입력 : ");
			int year = sc.nextInt();
			System.out.println("월 입력 : ");
			int month = sc.nextInt();
			System.out.println("일 입력 : ");
			int day = sc.nextInt();
			System.out.printf("그 해 %d번째 날입니다.\n", dayOfYear(year, month, day));

			System.out.println("반복(Yes(1) / No(0)");
			re = sc.nextInt();

		} while (re == 1);
	}

	static int[][] mdays = { 
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};

	// 평년, 윤년 계산
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 10 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int year, int month, int day) {

		int days = day;
		for (int i = 1; i < month; i++)
			days += mdays[isLeap(year)][i - 1];

		return days;
	}

	// 두 배열 비교는 여기서
	static boolean ArrayEqual(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length)
			return false;

		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;

		return true;
	}

}
