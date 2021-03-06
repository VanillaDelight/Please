import java.util.Scanner;

// 5명 학생 두 과목(영어, 수학)을 입력받아서 과목별 평균, 학생별 평균을 구하는 프로그램.

public class Student {

	public static void main(String[] args) {
		
		{
			Scanner sc = new Scanner(System.in);
			
			int num = 5;
			int sub = 2;
			double ave = 0;
			
			int[][] arr = new int [num][sub];
			
			for (int i = 0; i < arr.length; i++) {
				ave = 0;
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%d번째 학생의 영어점수를 입력하세요.\n", i + 1);
					int Eng_score = sc.nextInt();
					arr[i][j] = Eng_score;
					ave += Eng_score;
		
					j++;
					
					System.out.printf("%d번째 학생의 수학점수를 입력하세요.\n", i + 1);
					int Math_score = sc.nextInt();
					arr[i][j] = Math_score;
					ave += Math_score;
				}
				System.out.printf("%d번째 학생의 평균은 %.1f점 입니다.\n", i + 1, (double) (ave / arr[i].length));
			}
		}
		
		{
			Scanner sc = new Scanner(System.in);
			
			int number = 5;  // 인원수
			
			int[][] subject = new int[number][2]; //점수
			int[] totalStudent = new int[number];  //학생별 점수
			int[] totalSubject = new int[2];  //과목의 점수

			System.out.printf("%d명 영어, 수학 점수 입력.\n",number);
			
			for(int i=0; i<number; i++) {
				System.out.printf("%d번 영어:",i+1);
				subject[i][0] = sc.nextInt();  //영어
				System.out.println("    수학:");
				subject[i][1] = sc.nextInt();  //수학
				
				totalStudent[i] = subject[i][0] + subject[i][1];  //학생합계
				totalSubject[0] += subject[i][0];  //영어 합계
				totalSubject[1] += subject[i][1];  //수학 합계
			}
			
			System.out.println("No.    영어   수학   평균");
			for(int i=0; i<number; i++) 
				System.out.printf("%2d %6d %6d %6.1f\n", i+1, subject[i][0],
						subject[i][1],  (double)totalStudent[i]/2);
				
				System.out.printf("평균 %6.1f %6.1f\n", (double)totalSubject[0]/number,
														(double)totalSubject[1]/number);
		}
	}

}
