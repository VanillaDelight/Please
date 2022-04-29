import lombok.Getter;
import lombok.Setter;

class Exercise {

	public static void main(String[] args) {

		Student s = new Student("홍길", 1, 10, 90, 100, 60); // 생성자 호출
		
		System.out.println(s.getName());
		System.out.println(s.getAverage());
	}

}
@Setter //@는 어노테이션
@Getter

class Student {

	private String name;
	private int ban, no, kor, eng, math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int) ((getTotal() / 3.0 + 0.05) * 10) / 10.0;
	}
}