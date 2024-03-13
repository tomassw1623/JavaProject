package quiz;

public class Quiz_240313_moniter {

	public static void main(String[] args) {
	/*
		다음에 설명하는 객체에 클래스를 생성하여 확인하세요.

		모니터 클래스를 생성!!!
		- 모니터는 해상도, 크기, 크기, 밝기, 상태(on/off) 속성을 가짐
		- 모니터는 기본적으로 해상도, 크기, 밝기 값을 100. 상태는 off를 가리킴
		- 모니터에는 버튼을 누르는 메서드. 즉 전원 on/off기능이 존재함.
		 해당 메서드 실행시 전원이 켜져 있다면 커지고, 꺼져있다면 켜져야 함.
	*/

	}

}

class Moniter {
	
	static final int MAX = 100;
	
	// 멤버 변수 - 속성
	public int resolution;
	public int size;
	public int brightness;
	boolean status;
	
	// 생성자 constructors
	public Moniter() {
		this.resolution = MAX;
		this.size = MAX;
		this.brightness = MAX;
		this.status = false;
	}
	
	//전원 메서드
	public void pressPowerButton() {
		status = !status;
	}
}