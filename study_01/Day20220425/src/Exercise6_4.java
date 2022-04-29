
class Exercise6_4 {
	public static void main(String[] args) {
		Student6_4 s = new Student6_4();
		
		s.setName("홍길동");
		s.setBan(1);
		s.setNo(1);
		s.setKor(100);
		s.setEng(60);
		s.setMath(76);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("반 : " + s.getBan());
		System.out.println("번호 : " + s.getNo());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.println(s.info());
		
		System.out.println("-------------------");
		
		Student6_4 s2 = new Student6_4("김옥동", 3, 21, 90, 89, 78);
		
		System.out.println("이름 : " + s2.getName());
		System.out.println("반 : " + s2.getBan());
		System.out.println("번호 : " + s2.getNo());
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
		System.out.println(s2.info());
	}
}

class Student6_4 {
	
	private String name;
	private int ban, no, kor, eng, math;
	
	public Student6_4() {} // 디폴트 생성자는 반드시 기입하고 작성할것!
	
	public Student6_4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info() {
		return name + ", " + ban + ", " + no + ", " 
				+ kor + ", " + eng + ", " + math + ", " 
				+ getTotal() + ", " + getAverage();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAverage() {
		return (int) ((getTotal() / 3.0 + 0.05) * 10) / 10.0;
	}
	
}