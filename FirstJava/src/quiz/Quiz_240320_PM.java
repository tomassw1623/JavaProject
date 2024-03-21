package quiz;

/*
     [[[1. 집합 문제.... ]]] 
                다음의 리스트를 생성한 요구한 내용을 작성하세요
    ArrayList1 : [1,2,3,4,5,6]
    ArrayList2 : [4,5,6,7,8,9]

    두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요. 
    합집합 : [1,2,3,4,5,6,7,8,9]
    교집합 : [4,5,6]
    차집합 : [1,2,3],[7,8,9]
  
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Quiz_240320_PM {

	public static void main(String[] args) {
		
		// 선생님 답안
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		System.out.println("ArrayList1 : "+list1);
		System.out.println("ArrayList2 : "+list2);
		
		ArrayList union = new ArrayList(list1);
		for (Object o : list2) {
			if(!union.contains(o));
			union.add(o);
		}
		System.out.println("합집합 : "+union);
		
		ArrayList intersection = new ArrayList();
		for(Object o : list2)
			if(list1.contains(o))
				intersection.add(o);
		System.out.println("교집합 : "+intersection);
		
		ArrayList diff1 = new ArrayList(list1);
		for(Object o : list2)
			if(diff1.contains(o))
				diff1.remove(o);
		System.out.println("차집합 1 : "+ diff1);
		
		ArrayList diff2 = new ArrayList(list2);
		for(Object o : list1)
			if(diff2.contains(o))
				diff2.remove(o);
		System.out.println("차집합 2 : "+ diff2);
		
		ArrayList diff = new ArrayList();
		diff.add(diff1);
		diff.add(diff2);
		System.out.println("차집합 모음 : "+diff);
		
//		List<Integer> arr1 = new ArrayList<>();
//		List<Integer> arr2 = new ArrayList<>();
//		
//		// ArrayList1
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.add(4);
//		arr1.add(5);
//		arr1.add(6);
//		
//		// ArrayList2
//		arr2.add(4);
//		arr2.add(5);
//		arr2.add(6);
//		arr2.add(7);
//		arr2.add(8);
//		arr2.add(9);
//		
//		// set을 이용해 중복을 제거함
//		Set<Integer> set1 = new HashSet<>(arr1);
//		Set<Integer> set2 = new HashSet<>(arr2);
//		
//		// 합집합
//		Set<Integer> union = new HashSet<>(set1);
//		union.addAll(set2);
//		
//		// 교집합
//		Set<Integer> intersection = new HashSet<>(set1);
//		intersection.retainAll(set2);
//		
//		// 차집합
//		Set<Integer> difference1 = new HashSet<>(set1);
//		difference1.removeAll(set2);  // 세트에 주어진 엘리먼드 객체를 제거
//		Set<Integer> difference2 = new HashSet<>(set2);
//		difference2.removeAll(set1);
//		
//		System.out.println("합집합 : " +union);
//		System.out.println("교집합 : " +intersection);
//		System.out.println("차집합 : " +difference1+ "," +difference2);
//		System.out.println("=======================================================");
//		
///*
// 	   [[[2. 로또 번호 생성하기]]]
//    TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
//     1. TreeSet을 생성하세요
//     2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
//     3. 발생한 난수를 추가합니다. 
//     4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
// */
//		
//		System.out.println("\n로또번호 생성하기");
//		TreeSet<Integer> loot = new TreeSet<>();	// TreeSet 활용해 엘리먼트 정렬
//		while (loot.size() < 6) {
//		int randomnumber = (int)(Math.random()*45) +1;
//		loot.add(randomnumber);
//		}
//		System.out.println("로또 번호: "+ loot);
	}
}
