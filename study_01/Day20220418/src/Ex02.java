import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		// 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 * 을 찍어서
		// 그래프를 그리는 프로그램이다.

		int[][] score = {	
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}
						};
		int[][] result = new int [score.length + 1][score[0].length + 1];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][3] += score[i][j];
				result[5][j] += score[i][j];
				
				
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
	}

}
