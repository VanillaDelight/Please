package Exercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Exercise11_14 {

	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1 :
				inputRecord();
				break;
			case 2 :
				displayRecord();
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}// while(true)
	}
	
	// menu를 보여주는 메서드
	static int displayMenu() {
		int menu = 0;
		System.out.println("******************************************************");
		System.out.println("*                 성적 관리 프로그램                     *");
		System.out.println("******************************************************");
		System.out.println();
		System.out.println(" 1. 학생 성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생 성적 보기 ");
		System.out.println();
		System.out.println(" 3. 프로그램 종료 ");
		System.out.println();
		System.out.println(" 원하는 메뉴를 선택하세요.(1~3) : ");
		while (true) {
			int num = s.nextInt();
			if (num > 3 || num < 1) {
				System.out.println("1~3 사이의 숫자를 입력하세요.");
				continue;
			} else {
				menu = num;
				break;
			}
			
		}
		
		/* 아래의 로직에 맞게 코드작성
		 * 화면으로부터 메뉴를 입력 1~3
		 * 1~3사이의 값이 아니면 잘못되엇음을 알려주고 다시입력받기
		 */
		
		return menu;
	} // displayMenu()
	
	// 데이터를 입력받는 메서드
	
	static void inputRecord() {
		System.out.println("1. 학생 성적 입력하기");
		System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while (true) {
			System.out.println(">>");
			String words = s.next();
			
			if (words.equals("q") || words.equals("Q")) {
				System.out.println("메인화면으로 돌아갑니다.");
				return;
			} else {
				StringTokenizer st = new StringTokenizer(words, ",");

				String name1 = st.nextToken();
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				int num3 = Integer.parseInt(st.nextToken());
				int num4 = Integer.parseInt(st.nextToken());
				int num5 = Integer.parseInt(info[5]);
				record.add(new Student(name1, num1, num2, num3, num4, num5));
			}
			
			// 코드작성 1. scanner를 이용해서 입력받음 ','를 구분자로
			// 입력받은값이 q,Q면 종료, 아니면 입력받은값으로 student인스턴스 생성, record에 추가
			// 입력받은 값에서 예외가 발생하면, "입력오류입니다."를 보여주고 재입력받음
			//q,Q나올때까지 계속
			
		}//while
	}// intputRecord
	
	// 데이터 목록을 보여주는 메서드
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		int length = record.size();
		
		if (length > 0) {
			System.out.println();
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
			System.out.println("=======================================================");
			
			for (int i = 0; i < length; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("=======================================================");
			
			System.out.println("총점 : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("=======================================================");
			System.out.println("데이터가 없습니다.");
			System.out.println("=======================================================");
		}
	} //displayRecord
	
	class Student implements Comparable {
		String name;
		int ban, no, kor, eng, math, total, schoolRank, classRank;
		
		Student(String name, int ban, int no, int kor, int eng, int math) {
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			total = kor + eng + math;
		}
		
		int getTotal() {
			return total;
		}
		float getAverage() {
			return (int)((getTotal() / 3f) * 10 + 0.5) / 10f;
		}
		@Override
		public int compareTo(Object o) {
			if (o instanceof Student) {
				Student tmp = (Student)o;
				return tmp.total - this.total;
			} else {
				return -1;
			}
		}
		@Override
		public String toString() {
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank + "," + classRank;
		}
	} //class Student

}
