package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import obj.Customer;

// 고객 관리 클래스
public class CustomerManager {
	private static final String FILENAME = "C:\\AWSDEVEOP\\FirstJava\\saveFile\\CustomerManager.txt";  // 텍스트 파일 지정
	private List<Customer> customers; // 고객 리스트
	
	// 생성자
	public CustomerManager() {
		this.customers = new ArrayList<>();
		loadCustomersFromFile();  // 파일에서 고객정보 불러오기
	}
	
	// 파일로부터 고객 정보 불러오기
	private void loadCustomersFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            customers = (List<Customer>) ois.readObject();
            System.out.println("데이터를 불러왔습니다.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("파일을 불러오는 데 실패했습니다. 새로운 데이터베이스를 생성합니다.");
        }
    
	}
	
	// 파일에 고객 정보 저장하기
	private void saveCustomersToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(customers);
            System.out.println("데이터를 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	// 고객 추가
    public void addCustomer(Customer customer) {
        customers.add(customer);
        saveCustomersToFile();
    }

    // 이름으로 고객 삭제
    public void removeCustomerByName(String name) {
        customers.removeIf(customer -> customer.getName().equals(name));
        saveCustomersToFile();
    }

    // 이름으로 고객 조회
    public Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    // 이름으로 고객 정보 수정
    public void updateCustomerByName(String name, Customer updatedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getName().equals(name)) {
                customers.set(i, updatedCustomer);
                saveCustomersToFile();
                return;
            }
        }
        System.out.println("해당 이름의 고객이 없습니다.");
    }

    // 모든 고객 정보 출력
    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager(); // 고객 관리 객체 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== 고객 관리 프로그램 ======");
            System.out.println("1. 고객 추가");
            System.out.println("2. 고객 삭제");
            System.out.println("3. 고객 조회");
            System.out.println("4. 고객 수정");
            System.out.println("5. 전체 고객 조회");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("성별(M/F): ");
                    char gender = scanner.nextLine().charAt(0);
                    System.out.print("이메일: ");
                    String email = scanner.nextLine();
                    System.out.print("출생년도: ");
                    int birthYear = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 소비
                    Customer newCustomer = new Customer(name, gender, email, birthYear);
                    manager.addCustomer(newCustomer);
                    break;
                case 2:
                    System.out.print("삭제할 고객의 이름: ");
                    String removeName = scanner.nextLine();
                    manager.removeCustomerByName(removeName);
                    break;
                case 3:
                    System.out.print("조회할 고객의 이름: ");
                    String searchName = scanner.nextLine();
                    Customer foundCustomer = manager.findCustomerByName(searchName);
                    if (foundCustomer != null) {
                        System.out.println("고객 정보: " + foundCustomer);
                    } else {
                        System.out.println("해당하는 고객이 없습니다.");
                    }
                    break;
                case 4:
                    System.out.print("수정할 고객의 이름: ");
                    String updateName = scanner.nextLine();
                    Customer existingCustomer = manager.findCustomerByName(updateName);
                    if (existingCustomer != null) {
                        System.out.print("새 이름: ");
                        String newName = scanner.nextLine();
                        System.out.print("새 성별(M/F): ");
                        char newGender = scanner.nextLine().charAt(0);
                        System.out.print("새 이메일: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("새 출생년도: ");
                        int newBirthYear = scanner.nextInt();
                        scanner.nextLine(); // 개행 문자 소비
                        Customer updatedCustomer = new Customer(newName, newGender, newEmail, newBirthYear);
                        manager.updateCustomerByName(updateName, updatedCustomer);
                    } else {
                        System.out.println("해당하는 고객이 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("====== 전체 고객 조회 ======");
                    manager.displayAllCustomers();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}