import java.util.Calendar;

public class D10_Calendar {
	
	// millisec 변수를 long 형식으로 변경
	private static long millisec;

	public static void main(String[] args) {
		// 현재 시간 정보를 갖는 Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal); // 현재 시간 정보 출력

		// Calendar 인스턴스에서 년, 월, 일, 시, 분, 초 정보 추출
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int hod = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND); // MILLISECOND 대신 SECOND 사용
		
		// 시간 정보를 서식에 맞추어 출력
		System.out.printf("%d년 %d월 %d일 - %02d:%02d:%02d.%d\n",
				year, month, date, hour, min, sec, millisec);
		
		// 주어진 Calendar 인스턴스의 일련번호 출력
		printDayOfSeries(cal);
		
		// Calendar 인스턴스의 일 정보를 변경하여 출력
		cal.set(Calendar.DATE, 5);
		printDayOfSeries(cal);
		
		// Calendar 인스턴스의 날짜를 9일 추가하여 출력
		cal.add(Calendar.DATE, 9);
		printDayOfSeries(cal);
		
		// 원하는 필드 더하기
		// Calendar 인스턴스의 날짜를 8일 추가하여 출력 (DAY_OF_YEAR 대신 DATE 사용)
		cal.add(Calendar.DATE, 8);
		printDayOfSeries(cal);
		
		cal.add(Calendar.DATE, -20);
		printDayOfSeries(cal);
	}
	
	static void printDayOfSeries(Calendar cal) {
		// Calendar 인스턴스에서 요일, 월, 일 정보를 추출하여 출력
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 변수 추가
		
		// 요일 상수 출력
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FEBRUARY);
		System.out.println(Calendar.SATURDAY);
		System.out.println(Calendar.SUNDAY);
		
		// 구체적인 날짜 정보 출력
		System.out.println("-----------------------------------------------------");
		System.out.printf("dayOfYear : %d\n"
				+ "dayOfMonth : %d\n"
				+ "dayOfWeek : %d\n"
				+ "dayOfWeekInMonth : %d\n", // 서식 문자열 끝에 \n 추가 및 변수 추가
				dayOfYear, dayOfMonth, dayOfWeek, dayOfWeekInMonth);
	}

}
