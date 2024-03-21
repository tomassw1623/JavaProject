import java.time.Period;

import generic.Person;

public class E11_genericEx {

	public static void main(String[] args) {

		Person<Character> p1 = new Person<>('딸', 8);
		System.out.println(p1.getName());
		
		Person<String> p2 = new Person<>("아빠", 45);
		System.out.println(p2.getName());
		
		System.out.println(p1.test(4.8));   // double 타입
		System.out.println(p1.test("4.8")); // String 문자열
		System.out.println(p1.test(5));		// int
		System.out.println(p1.test('5'));	// char
	}

}
