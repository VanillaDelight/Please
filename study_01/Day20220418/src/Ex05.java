import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		int[] Arr = { 9, 6, 7, 3, 5 };
		
		System.out.println("최초 : " + Arrays.toString(Arr));
		
		for (int i = 0; i < Arr.length - 1; i++) {
			
			int index = i;

			for (int j = i + 1; j < Arr.length; j++) {
				
				if (Arr[index] > Arr[j]) 
					index = j;
			}

			if (index != i) {
				int tmp = Arr[index];
				Arr[index] = Arr[i];
				Arr[i] = tmp;

			}
			System.out.println(i + 1 + "번째 : " + Arrays.toString(Arr));
		}
	}

}
