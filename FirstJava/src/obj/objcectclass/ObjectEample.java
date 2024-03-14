package obj.objcectclass;

import obj.inheritance.Person;

public class ObjectEample {

	public static void main(String[] args) {
		Object obj = new Object();  // 최상위 객체
		obj.hashCode();  // 객체 동등 비교를 위해서  // 같은 자신
		obj.equals(obj); // 객체 동등 비교를 위해서 보통은 재정의해서 사용!!  // 서로 같은지 비교
		obj.toString();  // 기본적으로 클래스명@hashcode 값으로 출력  // 재정의 해서 객체 내의 정보를 확인하는 용도로 사용됩니다.!!!
		
		Person p1 = new Person(20,"홍길동");
		Person p2 = new Person("홍길동", 20, 185.0f, 0);
		System.out.println("1의 hashcode 값 : "+p1.hashCode());
		System.out.println("2의 hashcode 값 : "+p2.hashCode());
		System.out.println("p1과 p2의 비교 결과 : "+(p1.hashCode() == p2.hashCode()));
		
		// ()값이 같아도 객체가 다르기 때문에 해쉬값을 비교할 수 없다.
		
		Person o1 = new Person("홍길동", 20);
		Person oto1 = o1;
		Person o2 = new Person("홍길동", 20);
		System.out.println("o1의 해쉬값 : "+o1.hashCode());
		System.out.println("o2의 해쉬값 : "+o2.hashCode());
		System.out.println("oto1의 해쉬값 : "+oto1.hashCode());
		System.out.println("o1과 o2의 비교 결과 : "+(o1.hashCode() == oto1.hashCode()));
		System.out.println("o1과 o2의 equals 사용 : "+o1.equals(o2));
		
		Person p3 = new Person();
		System.out.println(new String("hello").hashCode()); // 객체 비교를 할려면 수정을 해야한다.
		System.out.println("hello".hashCode());
		// 참조자료형은  ==을 사용하여 비교할 수 없다 
		// 오브젝트가 아니라서 가능
		// equals는 왠만에서 사용하지 않습니다.
		// hashcode로 재정의를 통해 비교

	}

}
