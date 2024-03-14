import obj.inheritance.Person;
import obj.inheritance.goodcase.Student;

public class C03_inheritance_Example {


		public static void main(String[] args) {
			
//			person p = new person();
//			p.name = "홍길동";
//			p.age = 25;
//			p.height= 179.8f;
//			p.weight = 100.0f;
			
			Person p = new Person("홍길동", 25, 178.8f, 105.6f);
			System.out.println(p.getDatails());
			
//			Student s1 = new Student();
//			s1.name = "이순신";
//			s1.age = 30;
//			s1.studentId = "240314";
//			s1.major = "해양학과";
			Student s1 = new Student("이순신", 30, "20240314", "해양학과");
			System.out.println(s1.getDatails());
		}

	}