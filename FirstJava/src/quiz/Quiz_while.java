package quiz;

public class Quiz_while {

	public static void main(String[] args) {
		// while문을 이용하여
		// 구구단을 다음과 같이 세로로 출력해보새요.
		
		int gop = 0;
		while (gop <= 9) {
			
			int dan = 2;	// **반복시 원래의 2로 돌아와야 합니다.
			
			while (dan <= 9) {
				
				if(gop == 0) {
					System.out.println(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
				
				dan++;
			}
			System.out.println();
			
			gop++;
		}

	}

}
