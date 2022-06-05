
public class Ec_01 {

	public static void main(String[] args) {
		
		Ec_01_01 finder = new Ec_01_01();
		
		
		// 테스트 1
        int[] testArray1 = {3, 7, 3};
        System.out.println(finder.computeAverage(testArray1));

        // 테스트 2
        int[] testArray2 = {1, 3, 4, 7};
        System.out.println(finder.computeAverage(testArray2));

        // 테스트 3
        int[] testArray3 = {4};
        System.out.println(finder.computeAverage(testArray3));

        // 테스트 4
        int[] testArray4 = {1, 2, 3, 4, 5};
        System.out.println(finder.computeAverage(testArray4));
	}

}
