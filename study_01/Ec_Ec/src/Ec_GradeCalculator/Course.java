package Ec_GradeCalculator;

public class Course {
	
	public static final int CREDIT_MAJOR = 3;
	public static final int CREDIT_GENERAL = 2;
	
	private String subject;
	private int creditCount;
	private String grade;
	
	public Course() {}
	public Course(String subject, int creditCount, String grade) {
		this.subject = subject;
		this.creditCount = creditCount;
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getCreditCount() {
		return creditCount;
	}
	public void setCreditCount(int creditCount) {
		this.creditCount = creditCount;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double goInt(String grade) {
		switch (grade) {
		case "A+" : return 4.5;
		case "A" : return 4.0;
		case "B+" : return 3.5;
		case "B" : return 3.0;
		case "C+" : return 2.5;
		case "C" : return 2.0;
		case "D+" : return 1.5;
		case "D" : return 1.0;
		default : return 0;
		}
	}
	

}
