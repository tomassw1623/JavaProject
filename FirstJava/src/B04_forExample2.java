
public class B04_forExample2 {

	public static void main(String[] args) {
		// 이중(다중) for 구문
		for (int i = 0; i < 10; i++) {
			System.out.println("========================바깥 반복문" +i);
			
			for(int j=0; j < 10; j++) {
				System.out.println("------------------------안쪽 반복문 "+i+""+j);
				for (int k = 0; k < 10; k++) {
					System.out.println("++++ 제일 안쪽 반복문 "+i+"-"+j+"-"+k);
				}
			}
		}
		
		// 예제1) 구구단 출력하기
		// 2단부터 9단까지, 각 단은 1 ~ 9까지
		for (int y = 2; y < 10; y++) {	//단...
			for (int ｘ = 2; ｘ < 10; ｘ++) {
				if(y == 0) System.out.println(ｘ+"단 \t");
				else System.out.println(ｘ + "ｘ" + y + "=" +(ｘ*y)+"\t");
			}
			System.out.println(); //줄바꿈
		}
		

	}

}
