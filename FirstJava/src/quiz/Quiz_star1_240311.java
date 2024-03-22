package quiz;

public class Quiz_star1_240311 {

    public static void main(String[] args) {
        // for문을 이용하여 다음과 같이 별찍기를 진행... 4가지
        /*
         1)*     2)*****    3)*    4)*****
           **      ****       **      ****
           ***     ***        ***     ***
           ****    **         ****    **
           *****   *          *****   *
        */
        int dan = 5;

        // #1
        System.out.println("#1)");
        for (int i = 1; i <= dan; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // #2
        System.out.println("\n#2)");
        for (int i = 1; i <= dan; i++) {
            for (int j = dan - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // #3
        System.out.println("\n#3)");
        for (int i = 0; i < dan; i++) {
            for (int j = dan; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // #4
        System.out.println("\n#4)");
        for (int i = 0; i < dan; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < dan - i; k++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
