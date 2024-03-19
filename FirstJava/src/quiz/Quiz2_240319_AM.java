package quiz;

// 고객관리 프로그램 업그레이드 버전으로 회원의 정보를 입력한 후에 검색으로 회원 정보를 찾아서 수정, 삭제를 할 수 있습니다.(인덱스가 필요없음)

import java.util.Scanner;

import customermanager.oop.Customer;
// 내 답안
//
//public class Quiz2_240319_AM {
//	
//	static final int MAX = 100;
//	static Customer[] cusList = new Customer[MAX];
//	static int count = 0;
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		while(true) {
//			System.out.printf("\n[INFO] 고객 수 : %d\n", count);
//			System.out.println("메뉴를 입력하세요.");
//			System.out.println("(I)nsert, (S)earch, (U)pdate, (D)elete, (Q)uit"); // 정보 입력, 검색, 업데이트, 삭제, 종료
//			System.out.print("메뉴 입력 : ");
//			String menu = scan.next();
//			menu = menu.toLowerCase();  // 대소문자 구분
//			
//			switch(menu.charAt(0)) {
//			case 'i':
//			case 'ㅑ':
//				System.out.println("고객 정보 입력을 시작합니다.");
//				if (count >= MAX) {
//					System.out.println("더 이상 저장할 수 없습니다. ");
//				}else {
//					insertCustomerData();
//					System.out.println("고객 정보를 저장했습니다.");
//				}
//				break;
//			case 's':
//			case 'ㄴ':
//				System.out.println("고객 정보를 검색합니다.");
//				searchCustomer();
//				break;
//			case 'u':
//			case 'ㅕ':
//				System.out.println("고객 정보를 수정합니다.");
//				updateCustomer();
//				break;
//			case 'd':
//			case 'ㅇ':
//				System.out.println("고객 정보를 삭제합니다.");
//				deleteCustomer();
//				break;
//			case 'q':
//			case 'ㅂ':
//				System.out.println("프로그램을 종료합니다.");
//				scan.close();
//				System.exit(0);
//				break;
//			default :
//				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요");
//			}
//		}
//	}
//
//	public static void insertCustomerData() {
//		// 이름, 성별, 이메일, 출생년도 입력
//		System.out.print("이름 : ");
//		String name = scan.next();
//		System.out.print("성별 : ");
//		String gender = scan.next();
//		System.out.print("이메일 : ");
//		String email = scan.next();
//		System.out.print("출생년도 : ");
//		int birthYear = scan.nextInt();
//		// 고객 객체를 배열에 저장
//		Customer c1 = new Customer(name, gender, email, birthYear);
//		cusList[count] = c1;
//		count ++;
//	}
//	
//	public static void searchCustomer() {
//		System.out.print("찾을 고객의 이름을 입력하세요: ");
//		String searchName = scan.next();
//		boolean found = false;
//		for (int i = 0; i < count; i++) {
//			if (cusList[i].getName().equalsIgnoreCase(searchName)) {
//				System.out.println("고객을 찾았습니다.");
//				printCustomerData(i);
//				found = true;
//				break;
//			}
//		}
//		if (!found)
//			System.out.println("해당하는 고객을 찾을 수 없습니다.");
//	}
//	
//	public static void updateCustomer() {
//		System.out.print("수정할 고객의 이름을 입력하세요: ");
//		String searchName = scan.next();
//		boolean found = false;
//		for (int i = 0; i < count; i++) {
//			if (cusList[i].getName().equalsIgnoreCase(searchName)) {
//				System.out.println("고객을 찾았습니다. 정보를 수정합니다.");
//				updateCustomerData(i);
//				found = true;
//				break;
//			}
//		}
//		if (!found)
//			System.out.println("해당하는 고객을 찾을 수 없습니다.");
//	}
//	
//	public static void deleteCustomer() {
//		System.out.print("삭제할 고객의 이름을 입력하세요: ");
//		String searchName = scan.next();
//		boolean found = false;
//		for (int i = 0; i < count; i++) {
//			if (cusList[i].getName().equalsIgnoreCase(searchName)) {
//				System.out.println("고객을 찾았습니다. 삭제합니다.");
//				deleteCustomerData(i);
//				found = true;
//				break;
//			}
//		}
//		if (!found)
//			System.out.println("해당하는 고객을 찾을 수 없습니다.");
//	}
//	
//	public static void updateCustomerData(int index) {
//		System.out.print("이름("+cusList[index].getName()+") : ");
//		String name = scan.next();
//		if(name.length() != 0) {
//			cusList[index].setName(name);
//		}
//		System.out.print("성별("+cusList[index].getGender()+") : ");
//		cusList[index].setGender(scan.next());
//		System.out.print("이메일("+cusList[index].getEmail()+") : ");
//		cusList[index].setEmail(scan.next());
//		System.out.print("출생년도("+cusList[index].getBirthYear()+") : ");
//		cusList[index].setBirthYear(scan.nextInt());
//	}
//	
//	public static void deleteCustomerData(int index) {
//		for (int i = index; i < count - 1; i++) {
//			cusList[i] = cusList[i + 1];
//		}
//		count --;
//	}
//	
//	public static void printCustomerData(int index) {
//		System.out.println("==========CUSTOMER INFO==========");
//		System.out.println("이름 : "+cusList[index].getName());
//		System.out.println("성별 : "+cusList[index].getGender());
//		System.out.println("이메일 : "+cusList[index].getEmail());
//		System.out.println("출생년도 : "+cusList[index].getBirthYear());
//		System.out.println("=================================");
//	}
//}

// 선생님 답안===============================================================================================

public class Quiz2_240319_AM {
	
	// 배열에 저장할 수 있는 최대 고객 수 
	static final int MAX = 100;
	
	// Customer 객체의 배열을 선언
	static Customer[] cusList = new Customer[MAX];
	
	static int count;    // 고객 정보 저장 개수
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			// 고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d\n", count);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)elect, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();  // 대소문자 구분X 
			
			// 메뉴 선택시 동작을 구현... 
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다. ");
				}else {
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 's':
				System.out.println("현재 데이터를 출력합니다.");
				if(count > 0) {
					printCustomerData(selectCustomerData());
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if(count > 0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
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
		cusList[count] = c1;
		count++;   //count번째 배열에 객체 저장 후에 count값 증가... 	
		
	}
	
	public static Customer selectCustomerData() {
		while (true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력하세요.");
			String name = scan.next();
			for(int i = 0; i < count; i++) {
				if(cusList[i].getName().equals(name)) {
					return cusList[i];
				}
			}
			System.out.println("입력하신 이름을 가진 데이터가 없습니다.");
		}
	}
	
	public static void printCustomerData(Customer cus) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.println("이름 : "+cus.getName());
		System.out.println("성별 : "+cus.getGender());
		System.out.println("이메일 : "+cus.getEmail());
		System.out.println("출생년도 : "+cus.getBirthYear());
		System.out.println("=================================");
	}
	
	public static void updateCustomerData(Customer cus) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.print("이름("+cus.getName()+") :");
		String name = scan.next();
		if(name.length() != 0) {  // 검증... 
			cus.setName(name);
		}
		System.out.print("성별("+cus.getGender()+") : ");
		cus.setGender(scan.next());
		System.out.print("이메일("+cus.getEmail()+") : ");
		cus.setEmail(scan.next());
		System.out.print("출생년도("+cus.getBirthYear()+") : ");
		cus.setBirthYear(scan.nextInt());
	}
	
	public static void deleteCustomerData(Customer cus) {
		for (int i = 0; i < count - 1; i++) {
			if(cusList[i].getName().equals(cus.getName())) {
				for (int j = i; j < count; j++) {
					cusList[j] = cusList[j+1];
				}
			}
		}
		System.out.println("데이터가 삭제되었습니다.");
		count--;
	}
}