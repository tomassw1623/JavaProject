package obj.inheritance.badcase;

public class Teacher {
	
	// 이름, 나이,교본, 담당 과목
	String name;
	int age;
	String techerId;
	String subject;
	
	public String getDetails() {
		return "[이름: " +name+ "\t나이: " +age+ "\t교본: " +techerId+
				"\t담당 과목: " +subject+"]";
		
	}
	
	

}
