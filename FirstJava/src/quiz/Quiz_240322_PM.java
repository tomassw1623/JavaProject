package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// User 클래스: 사용자 정보를 저장하는 클래스
class User {
    private String name; // 이름
    private int age; // 나이

    // 생성자: 이름과 나이를 초기화
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름 Getter 메서드
    public String getName() {
        return name;
    }

    // 나이 Getter 메서드
    public int getAge() {
        return age;
    }

    // 문자열 반환 메서드: 이름과 나이를 문자열로 반환
    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }
}

// 메인 클래스
public class Quiz_240322_PM {

    public static void main(String[] args) {
        // 회원 목록을 저장할 리스트 생성
        List<User> people = new ArrayList<>();
        // 사용자 입력을 받을 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 무한 루프로 메뉴를 표시하고 사용자의 선택에 따라 처리
        while (true) {
            // 메뉴 출력
            System.out.println("메뉴를 입력하세요.");
            System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
            System.out.print(">>> ");
            int menu = scan.nextInt(); // 사용자의 선택을 입력 받음

            // 메뉴에 따른 처리
            if (menu == 1) { // 회원 등록
                System.out.println("이름을 입력하세요:");
                String name = scan.next(); // 이름 입력 받음
                System.out.println("나이를 입력하세요:");
                int age = scan.nextInt(); // 나이 입력 받음
                User user = new User(name, age); // 입력 받은 정보로 User 객체 생성
                people.add(user); // 리스트에 추가
                System.out.println("회원 등록이 완료되었습니다.");
            } else if (menu == 2) { // 전체 회원 정보 보기
                System.out.println("====== 모든 회원 정보 ======");
                for (User person : people) { // 리스트에 있는 모든 회원 정보 출력
                    System.out.println(person);
                }
                System.out.println("==========================");
            } else if (menu == 3) { // 회원정보 검색
                System.out.println("찾을 이름을 입력하세요:");
                String name = scan.next(); // 검색할 이름 입력 받음
                boolean found = false;
                for (User person : people) { // 리스트를 순회하며 검색
                    if (person.getName().equals(name)) { // 이름이 일치하는 경우
                        System.out.println(person); // 해당 회원 정보 출력
                        found = true; // 검색 성공 플래그 설정
                        break; // 검색 종료
                    }
                }
                if (!found) { // 검색 실패한 경우
                    System.out.println(name + "님은 목록에 없습니다.");
                }
            } else if (menu == 4) { // 회원정보 삭제
                System.out.println("삭제할 이름을 입력하세요:");
                String name = scan.next(); // 삭제할 이름 입력 받음
                boolean removed = false;
                for (User person : people) { // 리스트를 순회하며 검색
                    if (person.getName().equals(name)) { // 이름이 일치하는 경우
                        people.remove(person); // 해당 회원 삭제
                        removed = true; // 삭제 성공 플래그 설정
                        System.out.println(name + "님의 정보가 삭제되었습니다.");
                        break; // 삭제 종료
                    }
                }
                if (!removed) { // 삭제 실패한 경우
                    System.out.println(name + "님은 목록에 없습니다.");
                }
            } else if (menu == 5) { // 종료
                scan.close(); // Scanner 닫기
                System.out.println("프로그램을 종료합니다.");
                break; // 무한 루프 종료
            }
        }
    }
}
