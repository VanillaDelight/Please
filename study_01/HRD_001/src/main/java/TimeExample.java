import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExample {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date now = new Date();
		String nowTime1 = sdf1.format(now);
		String nowTime2 = sdf2.format(now);
		System.out.println(nowTime1);
		System.out.println(nowTime2); // 바로 출력도 가능 //System.out.println(sdf1.format(now));
										// //System.out.println(sdf2.format(now)); }

	}
}