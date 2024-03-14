package obj.inheritance;

/*
 *  상속(inheritance)
 *  - 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는 것을 의미함.
 *  - 기존의 코드를 재사용함으로 필요한 코드 재작성을 줄여줌.
 *  - 단일 상속만 가능(상속은 하나의 부모 클래스만 가질 수 있음) -> 단, 인터페이스는 다중 상속 가능
 *  - 키워드는 extends를 사용하여 상속을 표현
 *  - 부모(super) 클래스의 맴버(변수, 메서드)를 자식(sub) 클래스에서 사용이 가능함
 *  - 생성자는 상속이 안됨.
 *  - Sub Class "is a" Super Class
 *  ex) 말 extends 포유류 -> 말 is a 포유류
 *  ** has a 관계?
 *    - 객체가 맴버를 가지고 있다...
 *    class NameCard{
 *    	String name,
 *    	int size;
 *    }일 경우에, NameCard has a name
 *  - Object 클래스를 최상위 클래스
 *  - final 클래스는 상속불가...
 *  - abstract 클래스는 반드시 상속해서 사용해야 함.
 *  
 *  ** 상속 : Bad Case와 Good Case
 *   - Bad Case
 *    -> 개별 클래스들이 중복된 속성/기능을 포함하는 경우...
 *    
 *   - Good Case
 *    -> 중복된 기능을 빼고, 새로운 클래스로 작성한 후 구체화 시킨 경우
 *    -> 일반화 된 클래스는 부모 클래스
 *    -> 구체화 된 클래스는 자식 클래스
 *    -> extends 키워드를 사용하게 됨...
 */

public class Person {
	
	// 이름과 나이, 키, 몸무게, 성별...
	public String name;
	public int age;
	public float height;
	public float weight;
	
	public Person() {} // 기본 생성자
	
	public String getDatails() {
		return "[이름: " +name+ "\t나이: " +age+ "\t키: " +height+ "\t몸무게: " +weight+"]";
	}

	public Person(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

}


	
		
	
	
	


