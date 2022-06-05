
public class Ec_03_01 {
	public void printTriangle(int height) {
		for (int i = 1; i < height + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
