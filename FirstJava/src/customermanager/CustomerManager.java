package customermanager;

import java.util.Scanner;

public class CustomerManager {
	
	// 이전에 만들어 놓은 고객관리 프로그램을 OOP형식으로 변경하여 재 프로그래밍을 진행!
	// 1. Customer 클래스를 생성하고,
	// 2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요!
	// 고객 정보를 저장할 수 있는 배열 지정...

    // Customer 클래스 정의
    static class Customer {
        String name;
        String gender;
        String email;
        int birthYear;

        // Customer 생성자
        public Customer(String name, String gender, String email, int birthYear) {
            this.name = name;
            this.gender = gender;
            this.email = email;
            this.birthYear = birthYear;
        }
    }

    // 배열 크기 상수
    static final int MAX = 100;

    // 고객 정보를 저장할 배열 선언
    static Customer[] customerList = new Customer[MAX];

    // 배열 인덱스 및 저장된 고객 수 관리를 위한 변수
    static int index = -1; // 배열의 인덱스 시작은 0부터, 때문에 최소 인덱스는 -1이 되어야 함.
    static int count = 0; // 저장된 고객 수

    // Scanner 객체 생성
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // 고객 관리 메뉴 UI
            System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
            System.out.println("메뉴를 입력하세요.");
            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
            System.out.print("메뉴 입력: ");
            String menu = scan.next();
            menu = menu.toLowerCase();

            switch (menu.charAt(0)) {
                case 'i': // insert
                    System.out.println("고객 정보 입력을 시작합니다.");
                    if (count >= MAX) {
                        System.out.println("더 이상 저장할 수 없습니다.");
                    } else {
                        insertCustomerData();
                        System.out.println("고객 정보를 저장했습니다.");
                    }
                    break;
                case 'p': // previous
                    System.out.println("이전 데이터를 출력합니다.");
                    if (index <= 0) {
                        System.out.println("이전 데이터가 존재하지 않습니다.");
                    } else {
                        index--;
                        printCustomerData(index);
                    }
                    break;
                case 'n': // next
                    System.out.println("다음 데이터를 출력합니다.");
                    if (index >= count - 1) {
                        System.out.println("다음 데이터가 존재하지 않습니다.");
                    } else {
                        index++;
                        printCustomerData(index);
                    }
                    break;
                case 'c': // current
                    System.out.println("현재 데이터를 출력합니다.");
                    if ((index >= 0) && (index < count)) {
                        printCustomerData(index);
                    } else {
                        System.out.println("출력할 데이터가 선택되지 않았습니다.");
                    }
                    break;
                case 'u': // update
                	System.out.println("현제 데이터를 업데이트 수정하겠습니다.");
                	if ((index >= 0) && (index < count)) {
                        printCustomerData(index);
                	}else {
                		System.out.println("현재 데이터를 업데이트 했습니다");
                	}
                    break;
                    // 메서드는 만들었는데 구현을못하겠어요...
                case 'd': // delete
                    break;
                    // 메서드는 만들었는데 구현을못하겠어요...
                case 'q': // quit
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해주세요.");
            }
        }
    }

    // 고객 정보 입력 메서드
    public static void insertCustomerData() {
        System.out.print("이름: ");
        String name = scan.next();
        System.out.print("성별: ");
        String gender = scan.next();
        System.out.print("이메일: ");
        String email = scan.next();
        System.out.print("출생년도: ");
        int birthYear = scan.nextInt();

        // 커스터멀 객체 생성 후 배열에 저장
        customerList[count] = new Customer(name, gender, email, birthYear);
        count++; // 고객 증가
    }

    // 고객 정보 출력 메서드
    public static void printCustomerData(int index) {
        System.out.println("===========CUSTOMER INFO===========");
        System.out.println("이름 : " + customerList[index].name);
        System.out.println("성별 : " + customerList[index].gender);
        System.out.println("이메일 : " + customerList[index].email);
        System.out.println("출생년도 : " + customerList[index].birthYear);
        System.out.println("===========CUSTOMER INFO===========");
    }

    // 고객 정보 업데이트 메서드
    public static void updateCustomerData(int index) {
    }

    // 고객 정보 삭제 메서드
    public static void deleteCustomerData(int index) {
    }
}
