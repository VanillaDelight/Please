
public class Ex05 {

	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
			
			for (int r = 1; r <= 5; r++) {
				if (r >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
