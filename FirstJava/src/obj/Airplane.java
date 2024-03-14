package obj;

// Airplane 클래스 정의
class Airplane {
    String name; // 비행기 이름 멤버 변수

    // 생성자: 이름을 초기화하는 생성자
    public Airplane(String name) {
        this.name = name;
    }

    // 이륙 메서드
    public void takeOff() {
        System.out.println(name + " 이(가) 이륙합니다.");
    }

    // 비행 메서드
    public void fly() {
        System.out.println(name + " 이(가) 비행합니다.");
    }

    // 착륙 메서드
    public void land() {
        System.out.println(name + " 이(가) 착륙합니다.");
    }
}

// Airplane 클래스를 상속받는 SuperSonicAp 클래스 정의
class SuperSonicAp extends Airplane {
    int flyMode; // 비행 모드 변수

    // 생성자: 이름과 비행 모드를 초기화하는 생성자
    public SuperSonicAp(String name, int flyMode) {
        super(name); // 부모 클래스의 생성자 호출
        this.flyMode = flyMode;
    }

    // 비행 메서드 오버라이딩
    @Override
    public void fly() {
        if (flyMode == 1) {
            System.out.println("고속 모드로 비행합니다. " + name + " 이(가) 초음속으로 비행합니다.");
        } else {
            super.fly(); // 부모 클래스의 비행 메서드 호출
        }
    }
}

// 메인 클래스 정의
public class Airplane {
    public static void main(String[] args) {
        // SuperSonicAp 인스턴스 생성
        SuperSonicAp superSonicAp = new SuperSonicAp("초음속 제트기", 1);

        // fly 메서드 테스트
        superSonicAp.fly(); // "고속 모드로 비행합니다. 초음속 제트기 이(가) 초음속으로 비행합니다." 출력

        // fly 메서드를 0으로 변경하여 테스트
        superSonicAp.fly(); // "초음속 제트기 이(가) 비행합니다." 출력
    }
}
