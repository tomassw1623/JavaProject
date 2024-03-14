package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Empliyee extends Person{

	public String companyId;
	public String depertment;

	
	public String getDetails() {
		return "[이름: " +name+ "\t나이: " +age+ "\t사번: " +companyId+ "\t부서: " +depertment+"]";
	}
}
