package obj.inheritance.badcase;

public class Stydent {
	
	// 이름, 나이, 교본,담당 과목
	String name;
	int age;
	String studentId;
	String major;
	
	public String getDetails() {
		return "[이름: " +name+ "\t나이: " +age+ "\t학번: " +studentId+
				"\t전공: " +major+"]";
		
	}

}
