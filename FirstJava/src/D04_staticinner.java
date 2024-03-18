
class University {
	int num;
	static String naem;
	
	// static 내부 클래스 - static이 붙은 맴버와 동일하게 사용이 가능함.
	// 이 내부 클래스는 static이 붙어 있기 때문에 static 붙은 맴버에만 접근 가능.
	// 접근 방식에 의해서 객체 생성 방법에서 차이 생기게 된다...
	// static이 없는 맴버 이너클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능함.
	// staticdl 있는 경우에는 외부 클래스 객체 생성 없이 바로 호출이 가능함.
	
	static class Student{
		
	}
}

class HighSchool{
	// 맴버 이너 클래스
	class Student{
		
	}
}

public class D04_staticinner {

	public static void main(String[] args) {
		// static이 있는 경우..
		University.Student us = new University.Student();
		
		// statinc이 없는 경우
//		HighSchool.Student high = new HighSchool.Student();  // 안됨...
		HighSchool high = new HighSchool();
		HighSchool.Student hs = high.new Student();  // 내부 객체 생성

	}

}
