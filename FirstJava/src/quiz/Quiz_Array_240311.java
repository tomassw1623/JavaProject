package quiz;

import java.util.Arrays;
import java.util.Random;

public class Quiz_Array_240311 {

    public static void main(String[] args) {
        // 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100 사이의 
        //    랜덤 숫자로 채워보세요
    	// 배열 생성
//    	int[] numbers = new int[1000];	// 랜덤 값을 생성하기 위한 Random 객체 생성
//    	Random random = new Random();	// 배열에 랜덤 값 채우기
//    	for (int i = 0; i <numbers.length;i++) {
//    		numbers[i] = random.nextInt(100) + 1; // 1부터 100사이의 랜덤숫자 생성
//    	}
//    	
//    	// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요
//    	// 각 숫자의 등장 횟수를 저장하기 위한 배열 생성
//    	int[]counts = new int[100];	// 숫자 범위는 1부터 100까지로 가정, 각 숫자의 등장 횟수 계산
//    	for (int number: numbers) {
//    		counts[number -1]++;	// 해당 숫자의 등장 횟수 증가
//    	}
//    	
//    	// 각 숫자의 등장 횟수 출력
//    	for (int i = 0; i < counts.length;i++) {
//    		if(counts[i] > 0) {
//    			System.out.println((i + 1) +"는" +counts[i]+"번 등장합니다.");
//    			// ((i = 0부터 100번째를 나타냄 + 1)는 counts[i] = 0보다 큰고 100보다 작은 수의 등장 횟수를 계산한다.
//    		}
//    	}
    	// 선생님 답
    	// 배열 선언 및 최기화
    	int[] nums = new int[1000];
    	
    	// random 1 ~ 100사이 갑으로.. 대입...
    	for (int i = 0; i < 1000;i++) {
    		nums[i] = (int)(Math.random()*100) + 1; // 1~100 사이의 임의값!!
    	}
    	System.out.println(Arrays.toString(nums));
    	System.out.println(nums.length);
    	
    	int[] cnt = new int[100];
    	
    	for (int j = 1; j < 100;j++) {	// 1 ~ 100 사이에 나온 숫자의 횟차...
    		for (int i = 0; i < nums.length;i++) {	// 0~999 사이의 인덱스 참조...
    			if(j == nums[i]) {
    				cnt[j - 1]++;
    			}
    		}
    	}
    	// 검증...
    	int check = 0;
    	for (int i = 0; i < cnt.length;i++) {
    		System.out.println(i+1 +"이 나온 횟수 : "+cnt[i]);
    		check += cnt[i];
    	}
    	System.out.println(check); //check값은 1000이 되어야 합니다.
    	
    }
}
