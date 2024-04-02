package obj;

import java.io.Serializable;

public class Customer implements Serializable {

	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	//필드 생성자
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public char getGender() {
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

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

@Override
public String toString() {
	 return "이름: " + name + ", 성별: " + gender + ", "
	 		+ "이메일: " + email + ", 출생년도: " + birthYear;
	}
	
}