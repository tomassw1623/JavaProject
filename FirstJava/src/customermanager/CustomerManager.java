package customermanager;

import java.util.Scanner;

import customermanager.oop.Customer;

	//이전에 만들어 놓은 고객관리 프로그램을 OOP형식으로 변경하여 재 프로그래밍을 진행!
	// 1. Customer 클래스를 생성하고,
	// 2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요!


public class CustomerManager {
	
	// 배열에 저장할 수 있는 최대 고객 수 
	static final int MAX = 100;
	
	// Customer 객체의 배열을 선언
	static Customer[] cusList = new Customer[MAX];
	
	// 배열을 참조하기 위해서 인덱스를 사용... 
	static int index = -1;
	
	static int count = 0;    // 고객 정보 저장 개수
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			// 고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();  // 대소문자 구분X 
			// 메뉴 선택시 동작을 구현... 
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i':  // insert
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다. ");
				}else {
					//저장을 위한 메서드... 
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'ㅔ':
			case 'p':  // previous
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {  //이전 데이터가 존재하지 않는 경우
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					index --;
					printCustomerData(index);
				}
				break;
			case 'ㅜ':
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					index ++;
					printCustomerData(index);
				}
				break;
			case 'ㅊ':
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if((index >= 0)&&(index < count)) {
					printCustomerData(index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if((index >= 0)&&(index < count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerData(index);
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if((index >= 0)&&(index < count)) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomerData(index);
				}
				break;
			case 'ㅂ':
			case 'q':  //종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료
				break;
			default :
				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요");
			}
		}

	}

	public static void insertCustomerData() {
		// 이름, 성별, 이메일, 출생년도 입력
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		// 고객 객체를 배열에 저장
		Customer c1 = new Customer(name, gender, email, birthYear);
		/*  // or
		 * Customer c1 = new Customer();
		 * c1.setName(name);
		 * c1.setGender(gender);
		 * c1.setEmail(email);
		 * c1.setBirthYear(birthYear);
		 */
		cusList[count] = c1;
		count ++;   //count번째 배열에 객체 저장 후에 count값 증가... 	
		
	}
	
	public static void printCustomerData(int index) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.println("이름 : "+cusList[index].getName());
		System.out.println("성별 : "+cusList[index].getGender());
		System.out.println("이메일 : "+cusList[index].getEmail());
		System.out.println("출생년도 : "+cusList[index].getBirthYear());
		System.out.println("=================================");
	}
	
	public static void updateCustomerData(int index) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.print("이름("+cusList[index].getName()+") :");
		String name = scan.nextLine();
		if(name.length() != 0) {  // 검증... 
			cusList[index].setName(name);
		}
		System.out.print("이름("+cusList[index].getName()+") : ");
		cusList[index].setName(scan.next());
		System.out.print("성별("+cusList[index].getGender()+") : ");
		cusList[index].setGender(scan.next());
		System.out.print("이메일("+cusList[index].getEmail()+") : ");
		cusList[index].setEmail(scan.next());
		System.out.print("출생년도("+cusList[index].getBirthYear()+") : ");
		cusList[index].setBirthYear(scan.nextInt());
	}
	
	public static void deleteCustomerData(int index) {
		for (int i = index; i < count - 1; i++) {
			cusList[i] = cusList[i + 1];
		}
		count --;
	}
	

}

		
		// 고객 관리 프로그램
	
	
	

    // Customer 클래스 정의
//    static class Customer {
//        String name;
//        String gender;
//        String email;
//        int birthYear;
//
//        // Customer 생성자
//        public Customer(String name, String gender, String email, int birthYear) {
//            this.name = name;
//            this.gender = gender;
//            this.email = email;
//            this.birthYear = birthYear;
//        }
//    }
//
//    // 배열 크기 상수
//    static final int MAX = 100;
//
//    // 고객 정보를 저장할 배열 선언
//    static Customer[] customerList = new Customer[MAX];
//
//    // 배열 인덱스 및 저장된 고객 수 관리를 위한 변수
//    static int index = -1; // 배열의 인덱스 시작은 0부터, 때문에 최소 인덱스는 -1이 되어야 함.
//    static int count = 0; // 저장된 고객 수
//
//    // Scanner 객체 생성
//    static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (true) {
//            // 고객 관리 메뉴 UI
//            System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
//            System.out.println("메뉴를 입력하세요.");
//            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
//            System.out.print("메뉴 입력: ");
//            String menu = scan.next();
//            menu = menu.toLowerCase();
//
//            switch (menu.charAt(0)) {
//                case 'i': // insert 
//                case 'ㅑ':
//                    System.out.println("고객 정보 입력을 시작합니다.");
//                    if (count >= MAX) {
//                        System.out.println("더 이상 저장할 수 없습니다.");
//                    } else {
//                        insertCustomerData();
//                        System.out.println("고객 정보를 저장했습니다.");
//                    }
//                    break;
//                case 'p': // previous
//                    System.out.println("이전 데이터를 출력합니다.");
//                    if (index <= 0) {
//                        System.out.println("이전 데이터가 존재하지 않습니다.");
//                    } else {
//                        index--;
//                        printCustomerData(index);
//                    }
//                    break;
//                case 'n': // next
//                    System.out.println("다음 데이터를 출력합니다.");
//                    if (index >= count - 1) {
//                        System.out.println("다음 데이터가 존재하지 않습니다.");
//                    } else {
//                        index++;
//                        printCustomerData(index);
//                    }
//                    break;
//                case 'c': // current
//                    System.out.println("현재 데이터를 출력합니다.");
//                    if ((index >= 0) && (index < count)) {
//                        printCustomerData(index);
//                    } else {
//                        System.out.println("출력할 데이터가 선택되지 않았습니다.");
//                    }
//                    break;
//                case 'u': // update
//                    System.out.println("현제 데이터를 업데이트 수정하겠습니다.");
//                    if ((index >= 0) && (index < count)) {
//                        updateCustomerData(index);
//                        System.out.println("고객 정보를 업데이트했습니다.");
//                    } else {
//                        System.out.println("업데이트할 데이터가 선택되지 않았습니다.");
//                    }
//                    break;
//
//                case 'd': // delete
//                    System.out.println("고객 정보를 삭제합니다.");
//                    if ((index >= 0) && (index < count)) {
//                        deleteCustomerData(index);
//                        System.out.println("고객 정보를 삭제했습니다.");
//                    } else {
//                        System.out.println("삭제할 데이터가 선택되지 않았습니다.");
//                    }
//                    break;
//
//                    // 메서드는 만들었는데 구현을못하겠어요...
//                case 'q': // quit
//                    System.out.println("프로그램을 종료합니다.");
//                    scan.close();
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해주세요.");
//            }
//        }
//    }
//
//    // 고객 정보 입력 메서드
//    public static void insertCustomerData() {
//        System.out.print("이름: ");
//        String name = scan.next();
//        System.out.print("성별: ");
//        String gender = scan.next();
//        System.out.print("이메일: ");
//        String email = scan.next();
//        System.out.print("출생년도: ");
//        int birthYear = scan.nextInt();
//
//        // 커스터멀 객체 생성 후 배열에 저장
//        customerList[count] = new Customer(name, gender, email, birthYear);
//        count++; // 고객 증가
//    }
//
//    // 고객 정보 출력 메서드
//    public static void printCustomerData(int index) {
//        System.out.println("===========CUSTOMER INFO===========");
//        System.out.println("이름 : " + customerList[index].name);
//        System.out.println("성별 : " + customerList[index].gender);
//        System.out.println("이메일 : " + customerList[index].email);
//        System.out.println("출생년도 : " + customerList[index].birthYear);
//        System.out.println("===========CUSTOMER INFO===========");
//    }
//
//    // 고객 정보 업데이트 메서드
// // 고객 정보 업데이트 메서드
//    public static void updateCustomerData(int index) {
//        System.out.println("---------UPDATE CUSTOMER INFO---------");
//        System.out.println("이름(" + customerList[index].name + "): ");
//        String name = scan.next();
//        if (!name.isEmpty()) {
//            customerList[index].name = name;
//        }
//        System.out.println("성별(" + customerList[index].gender + "): ");
//        String gender = scan.next();
//        if (!gender.isEmpty()) {
//            customerList[index].gender = gender;
//        }
//        System.out.println("이메일(" + customerList[index].email + "): ");
//        String email = scan.next();
//        if (!email.isEmpty()) {
//            customerList[index].email = email;
//        }
//        System.out.println("출생년도(" + customerList[index].birthYear + "): ");
//        int birthYear = scan.nextInt();
//        if (birthYear != 0) {
//            customerList[index].birthYear = birthYear;
//        }
//    }
//
//    // 고객 정보 삭제 메서드
//    public static void deleteCustomerData(int index) {
//        System.out.println("고객 정보를 삭제합니다.");
//        for (int i = index; i < count - 1; i++) {
//            customerList[i] = customerList[i + 1];
//        }
//        customerList[count - 1] = null; // 삭제된 위치에 null 할당
//        count--; // 저장된 고객 수 감소
//    }
	

