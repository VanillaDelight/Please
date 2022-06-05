
public class Ec_02_01 {
	int greatestDifference(int[] intArray) {
		if(intArray.length < 2) 
			return 0;
		
		return Max(intArray) - Min(intArray);
	}
	
	int Max(int[] intArray) {
		int tmp = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[0] < intArray[i]) {
				tmp = intArray[0];
				intArray[0]	= intArray[i];
				intArray[i] = tmp;
			}
		}
		return intArray[0];
	}
	
	int Min(int[] intArray) {
		int tmp = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[0] > intArray[i]) {
				tmp = intArray[0];
				intArray[0]	= intArray[i];
				intArray[i] = tmp;
			}
		}
		return intArray[0];
	}
}
