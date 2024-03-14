package customermanager.oop;

public class Customer {
	
	//멤버변수(속성)
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	public Customer() {  }   //기본 생성자  ***단축키: Shift+Alt+S(from Superclass)***

	public Customer(String name, String gender, String email, int birthYear) {  //필드 생성자 ***단축키: Shift+Alt+S(usingfields)***
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	// Getter, Setter  // ***단축키: Shift+Alt+S(Getter and Setter)***
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override  ////기본 생성자  ***단축키: Shift+Alt+S(toString)***
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + 
				", birthYear=" + birthYear + "]";
	}

	
	
	
	

}