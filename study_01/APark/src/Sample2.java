import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.println("*");
			}
			sc.next();
		}
	}
}
