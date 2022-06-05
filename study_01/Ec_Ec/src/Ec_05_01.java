
public class Ec_05_01 {
	public void printFloydsPyramid(int height) {
		// 숫자 자리 구하기
		int length = String.valueOf(height * (height + 1) / 2).length();

		// 인쇄될 수
		int number = 1;

		// 반복문 1 - 행을 바꾸는 반복문
		for (int row = 1; row <= height; row++) {

			// 한 행마다 인쇄될 내용을 담는 문자열을 선언해준 후, 아래의 내용을 더해주면 좋음.
			String line = "";

			// 반복문 2 - 한 행에서 열을 바꾸는 반복문
			for (int col = 1; col <= row; col++) {
				
				// 반복문 3 - 한 열 안에서 자리수를 맞추는 반복문
				for (int i = String.valueOf(number).length(); i < length; i++) {
					line += " ";
				}
				// 실제 인쇄될 수를 문자열에 더하고, 한 칸 띄워주기
				line += (number + " ");
				
				number++;
			}
			// 각 줄을 출력: 각 줄의 숫자, 패딩, 공백에 유의해야 함.

			// 출력
			System.out.println(line);
		}
	}
}
