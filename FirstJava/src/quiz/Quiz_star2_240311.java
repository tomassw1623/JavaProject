package quiz;
public class Quiz_star2_240311 {
    public static void main(String[] args) {
        int dan = 5;
        
        // #1
        System.out.println("#1");
        for (int i = 0; i < dan; i++) {
            for (int j = 0; j < dan - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // #2
        System.out.println("\n#2");
        for (int i = 0; i < dan; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                
            }
            for (int k = 0; k < 2 * (dan - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
