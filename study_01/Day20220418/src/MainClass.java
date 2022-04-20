import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		int count = 0;
		{
			File file = new File("data/data1.txt");
			
			FileInputStream src = new FileInputStream(file);
			
			Scanner sc = new Scanner(src);
			
			while (sc.hasNext())	{
				String tmp = sc.next();
				System.out.printf("%s ", tmp);
				count++;
		}
		
		sc.close();
		src.close();
		}
		int[] nums = new int[count];
		System.out.println();
		{
			File file = new File("data/data1.txt");
			FileInputStream src = new FileInputStream(file);
			Scanner sc = new Scanner(src);
			
			for (int i = 0; i < count; i++) {
				String tmp = sc.next();
				nums[i] = Integer.parseInt(tmp);
			}
			System.out.println(Arrays.toString(nums));
			sc.close();
			src.close();
		}
		//배열에서 특정 숫자를 찾기
		
		{
			Scanner sc = new Scanner(System.in);
			int num	= sc.nextInt();
			for (int i = 0; i < count; i++) {
				if (nums[i] == num) {
					System.out.println(i);
					break;
				}
			}
		}
		
		//index 위치 변경 --> 0 <--> 5 위치 교환
		{
//			Scanner sc = new Scanner(System.in);
//			int num	= sc.nextInt();
			for (int i = 0; i < count - 1; i ++) {
				int tmp;
				tmp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = tmp;
				
				Thread.sleep(1000);
				
				for (int j = 0; j < 50; j++)
					System.out.println();
				
				for (int j = 0; j < count; j++) {
					if (j == i + 1)
						System.out.printf("[%d] ", nums[j]);
					else
						System.out.printf("%d ", nums[j]);
					}
			}
//			System.out.println(Arrays.toString(nums));
			
		}
	}

}
