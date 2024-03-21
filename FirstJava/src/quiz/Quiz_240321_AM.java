package quiz;

import java.util.HashMap;
import java.util.Map;

public class Quiz_240321_AM {
	
	// 선생님 답안============================================================
	// 참가자

	public static void main(String[] args) {
			String[] first_pa = {"leo","kiki","eden"};
			String[] second_pa = {"marina","josipa","nikola","vinko","filipa"};
			String[] third_pa = {"mislav","sanko","mislav","ana"};
			
			// 완주자
			String[] first_com = {"kiki","eden"};
			String[] second_com = {"marina","josipa","nikola","filipa"};
			String[] third_com = {"mislav","sanko","ana"};
			
			System.out.println("첫번째 사례 : "+solution(first_pa, first_com));  //leo
			System.out.println("첫번째 사례 : "+solution(second_pa, second_com));
			System.out.println("첫번째 사례 : "+solution(third_pa, third_com));
		}
		
		public static String solution(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> hm = new HashMap<>();
			for (String player: participant) hm.put(player, hm.getOrDefault(player, 0)+1);
			System.out.println("참가자 결과 : " + hm);
			for (String player: completion) hm.put(player, hm.get(player) - 1);
			System.out.println("완주자 처리 결과 : " + hm);
			for (String key : hm.keySet()) {
				if(hm.get(key) != 0) {
					answer = key;
				}
			}
			return answer;
		}

	}

//    public static String solution(String[] participant, String[] completion) {
//        // 각 선수의 이름과 등장 횟수를 기록할 HashMap 생성
//        Map<String, Integer> map = new HashMap<>();
//
//        // 참가자 명단을 기록하고, 등장 횟수를 1씩 증가시킴
//        for (String p : participant) {
//            map.put(p, map.getOrDefault(p, 0) + 1);
//        }
//
//        // 완주자 명단을 기록하고, 해당 선수의 등장 횟수를 1씩 감소시킴
//        for (String c : completion) {
//            map.put(c, map.get(c) - 1);
//        }
//
//        // 등장 횟수가 0이 아닌 선수가 완주하지 못한 선수
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getValue() != 0) {
//                return entry.getKey();
//            }
//        }
//
//        // 여기까지 왔다면 완주하지 못한 선수가 없는 경우이므로 에러 처리 등을 추가할 수 있음
//        return null;
//    }

//    public static void main(String[] args) {
////        String[] participant1 = {"leo", "kiki", "eden"};
////        String[] completion1 = {"eden", "kiki"};
////        System.out.println(solution(participant1, completion1)); // 예상 출력: "leo"
////
////        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
////        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
////        System.out.println(solution(participant2, completion2)); // 예상 출력: "vinko"
////
////        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
////        String[] completion3 = {"stanko", "ana", "mislav"};
////        System.out.println(solution(participant3, completion3)); // 예상 출력: "mislav"
//    }
//}
