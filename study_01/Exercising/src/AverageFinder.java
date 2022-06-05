
public class AverageFinder {
	public double computeAverage(int[] intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return (double)sum / intArray.length;
		// 코드를 입력하세요.
	}
}

class AberageFinder_fun {
	public static void main(String[] args) {
		AverageFinder finder = new AverageFinder();

		// 테스트 1
		int[] testArray1 = { 3, 7, 3 };
		System.out.println(finder.computeAverage(testArray1));

		// 테스트 2
		int[] testArray2 = { 1, 3, 4, 7 };
		System.out.println(finder.computeAverage(testArray2));

		// 테스트 3
		int[] testArray3 = { 4 };
		System.out.println(finder.computeAverage(testArray3));

		// 테스트 4
		int[] testArray4 = { 1, 2, 3, 4, 5 };
		System.out.println(finder.computeAverage(testArray4));
	}

}
