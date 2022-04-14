import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		int[] nArr = new int[10];
		
		
		for (int i = 0; i < nArr.length; i++) {
			nArr[i] = (int) (Math.random() * 99) + 1;
			sum += nArr[i];
		}
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double) sum / nArr.length);
	}

}
