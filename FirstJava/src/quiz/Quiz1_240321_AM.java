package quiz;

/*
 	매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 k이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 
 	k이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞여 새로운 음식을 만듭니다.
 	
 	섞은 음식의 스코필 지수 = 가장 맴지 않은 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수*2)
 	
 	Leo는 모든 음식의 스코빌 지수가 k이상이 될 때까지 반복하여 섞습니다.
 	Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville 과 원하는 스코빌 지수 k가 주어졌을 때, 모든 음식의 스코빌 
 	지수를 k 이상으로 만들기 위해 섞여야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
 	
 	 - 모든 음식의 스코빌 지수를 k이상으로 만들 수 없는 경우에는 -1을 return 합니다.
 	 ----------------------------------
 	 scoville			k		return
 	 ----------------------------------
 	 [1,2,3,9,10,12]	7		2
 	 ----------------------------------
 	 
 	 Queue에는 우선순위를 지정할 수 있는 PriorityQueue가 있습니다.
 	 비교 메서드인 compare()나 comparareTo()를 이용해 우선순위를 지
 	 정하여 사용할 수 있습니다. 이 문제는 우선순위 큐를 이용하면 
 	 쉽게 해결할 수 있습니다.
 	 
*/
import java.util.PriorityQueue;

public class Quiz1_240321_AM {
	
	public static void main(String[] args) {
		int[] scoville = {2, 3, 9, 10, 1, 12};
		int K = 7;
		System.out.println("음식을 최소 몇번 섞었을 때 원하는 맴기가 될까?"
		+ solution1 (scoville, K));
	}
	
	public static int solution1(int[] scoville, int K) {
		int answer = 0; // 시도횟수
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i : scoville) {
			que.add(i);
		}
		System.out.println("PriorityQueue 내용 : "+que);
		
		while (true) {
			answer ++;
			int result = que.poll() + (que.poll()*2);
			que.add(result);
			System.out.println(answer +"번째 Que의 내용 : "+que);
			// 정해진 맵기 k값을 넘어서는 섞은 음식인 경우, 그 회차를 반환
			if(que.peek() >= K) return answer;
			// k이상으로 만들 수 없는 경우 반환갑ㄱ은 -1
			if(que.size() == 1) return -1;
		}
//		return answer;
	}

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        // 모든 음식의 스코빌 지수를 우선순위 큐에 추가합니다.
//        for (int s : scoville) {
//            pq.offer(s);
//        }
//
//        int mixCount = 0;
//        
//        // 최소 맵지 않은 음식의 스코빌 지수가 k 이상이 될 때까지 반복합니다.
//        while (pq.size() > 1 && pq.peek() < k) {
//            int first = pq.poll(); // 가장 맵지 않은 음식
//            int second = pq.poll(); // 두 번째로 맵지 않은 음식
//
//            // 두 음식을 섞어 새로운 음식을 만듭니다.
//            int newScoville = first + (second * 2);
//            pq.offer(newScoville); // 섞인 음식을 우선순위 큐에 추가합니다.
//            mixCount++; // 섞은 횟수를 증가시킵니다.
//        }
//
//        // 모든 음식의 스코빌 지수가 k 이상인지 확인합니다.
//        if (pq.peek() < k) {
//            return -1; // 불가능한 경우 -1을 반환합니다.
//        }
//
//        return mixCount; // 섞은 횟수를 반환합니다.
//    }
//
//    public static void main(String[] args) {
//        int[] scoville = {1, 2, 3, 9, 10, 12};
//        int k = 7;
//        System.out.println(solution(scoville, k)); // 결과: 2
    }

