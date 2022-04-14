import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			
		}
		System.out.println(Arrays.toString(a));
	
		
		int b;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i] < a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
