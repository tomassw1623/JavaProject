package quiz;

// 인터페이스 입력
interface Feed {
	String getFood();
}
// 육식, 초식 클래스 입력
class Carnivore{ // 육식
	
}

class Herbivore{ // 초식
	
}
// 사슴 메서드 정의
class Deer extends Herbivore implements Feed{ // 사슴
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "건초";
	}
}
// 사자 메서드 정의
class Lion extends Carnivore implements Feed{ // 사자
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "고기";
	}
}
// 사육사 메서드 정의
class ZooKeaper { // 사육사
	
	public void feed(Feed feed) {
		System.out.println(feed.getFood()+"를 줍니다.");
	}
}

public class Quiz2_240318_PM {

	public static void main(String[] args) {
		ZooKeaper zk = new ZooKeaper(); // 줄이는게 편함
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);  // 실행 입력
		zk.feed(lion);
		
	}

}
