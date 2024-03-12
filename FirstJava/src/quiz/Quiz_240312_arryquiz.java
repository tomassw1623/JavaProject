package quiz;

public class Quiz_240312_arryquiz {

    public static void main(String[] args) {
        // numArr의 값들의 총합과 평균을 구해서 출력하시오.
        int[][] numArr = {
                {5, 5, 5, 5, 5},     // 0
                {10, 10, 10, 10, 10}, // 1
                {20, 20, 20},         // 2
                {30, 30, 30}          // 3
        };
        
        int sum = 0; //총합
        int items = 0;  // 전체 요소의 갯수
        
        // 이중 반복문을 사용하여 배열의 모든 요소를 합산합니다.
        for (int i = 0; i < numArr.length; i++) {
        	items += numArr[i].length;
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j];
            }
        }
        
        // 총합 출력
        System.out.println("총합: " + sum);
    	// 평균 출력 (총합을 요소의 개수로 나눈 값)
        System.out.println("평균 : "+(int)((sum / (double)items)*100)/100.0);
    }
}
