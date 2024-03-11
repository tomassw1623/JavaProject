package quiz;
public class Quiz_star2_240311 {
    public static void main(String[] args) {
    	// 피라미드 찍기
    	/*
		#1		*		2# *********
			   ***			*******
			  *****			 *****
			 *******		  ***
			*********		   *
		*/

    	
//        int dan = 5;
        
        // #1(내 답안)
//        System.out.println("#1");
//        for (int i = 0; i < dan; i++) {
//            for (int j = 0; j < dan - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 2 * i + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        // 선생님 답안
        // #1
    	int dan = 5;
    	
    	for (int i = 0; i < dan; i++) {
    		// space 출력
    		for (int j = 0; j < dan - i -1; j++) {
    			System.out.print(" ");
    		}
    		// 별 찍기
    		for (int j = 0; j < i*2 + 1; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
        
        
        // #2(내 답안)
//        System.out.println("\n#2");
//        for (int i = 0; i < dan; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//                
//            }
//            for (int k = 0; k < 2 * (dan - i) - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        // 선생님 답안
        // #2
    	System.out.println();
    	for (int i = 0; i < dan; i++) {
    		// space 출력
    		for (int j = 0; j < i; j++) {
    			System.out.print(" ");
    		}
    		// 별 찍기
    		for (int j = 0; j < 2*dan -(2*i) - 1; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
