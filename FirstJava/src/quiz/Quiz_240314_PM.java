package quiz;

class Airplane {
	
	// 클래스 정의
	String name;	// 비행기 맴버 변수
	
	// 생성자: 이름을 초기화하는 생성자
	public Airplane (String name) {
		this.name = "대한항공";
	}
	
	// 이륙 메세드
	public void takeOff(){
		System.out.println(name+"가 이륙합니다.");
		
	}
	
	// 비행기 메서드
	public void fly() {
		System.out.println(name+"가 비행합니다.");
	}
	
	public void land() {
		System.out.println(name+"가 착륙합니다.");
	}
}

class SuperSonicAp extends Airplane {
	int flyMode;
	 public SuperSonicAp(String name, int flyMode) {
	        super(name); // 부모 클래스의 생성자 호출
	        this.flyMode = flyMode;
	    }
	 // 비행기 메서드 오버라이딩
	 @Override
	 public void fly() {
		 if(flyMode == 1) {
			 System.out.println("고속 모드로 비행합니다."+name+"오 개빨라");
		 }else{
			 super.fly();
		 }
	 }
	 
	
	
	/*
	 *  Airplane은 멤버 변수로 name을 가지고 있습니다. 
	 *  생성자로 이름을 입력받아 초기화 받게 설정하고, 
	 *  메서드는 takeOff(), fly(), land() 3가지를 가지고 있습니다.
	 * 
	 *  1. Airplane을 생성 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */

}

public class Quiz_240314_PM {
	
	public static void main(String[] args) {
		// SuperSonicAp 인스턴스 생성
        SuperSonicAp superSonicAp = new SuperSonicAp("초음속 제트기 ", 1);

        // fly 메서드 테스트
        superSonicAp.fly(); 
        // fly 메서드를 0으로 변경하여 테스트
        superSonicAp.fly(); // "초음속 제트기 이(가) 비행합니다." 출력
    }
}
