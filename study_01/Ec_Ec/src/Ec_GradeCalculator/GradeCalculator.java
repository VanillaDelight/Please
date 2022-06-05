package Ec_GradeCalculator;

public class GradeCalculator {
	
	private final String name;
	private final double beforeScore;
	private final int beforeCredit;
	private int sumCredit;
	private double sumScore;
	
	
	public GradeCalculator(String name, double beforeScore, int beforeCredit) {
		this.name = name;
		this.beforeScore = beforeScore;
		this.beforeCredit = beforeCredit;
	}
	public void addCourse(Course course) {
		sumCredit += course.getCreditCount();
		sumScore += (course.goInt(course.getGrade()) * course.getCreditCount());
	}
	public void print() {
		System.out.println("직전 학기 성적: " + beforeScore + " (총 " + beforeCredit + "학점)");
		System.out.println("이번 학기 성적: " + (sumScore / sumCredit) + " (총 " + sumCredit + "학점)");
		System.out.println("전체 예상 학점: " + ((beforeScore * beforeCredit) + sumScore) / (beforeCredit + sumCredit) + " (총 " + (beforeCredit + sumCredit) + "학점)");
	}
	
	

}
