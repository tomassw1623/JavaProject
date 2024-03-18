package obj.inheritance.goodcase;

import obj.inheritance.Person; 

public class Teacher extends Person{
	
	public String teacherId;
	public String subject;
	
	public Teacher(){}
	
	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "[이름: " +name+ "\t나이: " +age+ "\t교본: " +teacherId+ "\t담당 과목: " +subject+"]";
	}

	
}
