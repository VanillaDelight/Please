import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int r = 1; r <= i; r++) {
				if (r == i) {
					System.out.println("*");
					break;
				}
//				if (i > num / 2) {
//					for (int t = num / 2; t > 0; t++) {
//						System.out.println();
					}
				System.out.print("*");
				}
			
			}	
		}
	}

}
