import java.text.SimpleDateFormat;
import java.util.Date;

public class D12_date {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		
		
		// 특정 문자열 포멧으로 얻어내고 싶은 경우... SimpleDateFormat 클래스 사용.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
		// hh - 12시간, HH - 24시간
		String time = sdf.format(date);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년중 D번째 날입니다.");
		System.out.println(sdf.format(date));
	}

}
