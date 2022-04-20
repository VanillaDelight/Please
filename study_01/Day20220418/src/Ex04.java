import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		double average = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
			count += 1;
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum / count);
		
		int sum2 = 0;
		int count2 = 0;
		int j = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum2 += i;
				count2 += 1;
				
			}
		}System.out.println("\n------------------------\n");

		int nArr[] = new int[count2];
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				nArr[j++] = i;
			}
		}
		System.out.println(Arrays.toString(nArr));
		System.out.println("갯수 : " + count2);
		System.out.println("총합 : " + sum2);
		
	}

}
