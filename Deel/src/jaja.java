import java.util.Scanner;

public class jaja {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.printf("sum(%d)\n", sum);
		
		for (; ;) {
			Scanner sc1 = new Scanner(System.in);
			String ch = sc1.nextLine();
			Scanner sc2 = new Scanner(System.in);
			int num = sc2.nextInt();
			
			switch (ch) {
			
			case "+":
				sum += num;
				break;
			case "-":
				sum -= num;
				break;
			case "*":
				sum *= num;
				break;
			case "/":
				sum /= num;
				break;
			default:
				System.out.println("Àß¸ø");
				
			}
			System.out.printf("sum(%d)\n", sum);
		}
		
	}

}
