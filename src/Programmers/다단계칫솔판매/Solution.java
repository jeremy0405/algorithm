package Programmers.다단계칫솔판매;

/*
	문제    : 프로그래머스 다단계 칫솔 판매
    유형    : 트리, 구현
	난이도   : MEDIUM(level3)
	시간    : 30m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/77486
    날짜    : 22.09.29(o)
    refer  :
*/

import java.util.HashMap;
import java.util.Map;

class Solution {

	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

		Map<String, String> tree = new HashMap<>();
		for (int i = 0; i < enroll.length; i++) {
			String ref = referral[i];
			if (!ref.equals("-")) {
				tree.put(enroll[i], referral[i]);
			} else {
				tree.put(enroll[i], null);
			}
		}

		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < seller.length; i++) {
			String s = seller[i];
			int money = amount[i] * 100;

			while (s != null) {
				int parentMoney = money / 10;
				int myMoney = money - parentMoney;

				result.put(s, result.getOrDefault(s, 0) + myMoney);

				if (parentMoney < 1) {
					break;
				}
				money = parentMoney;
				s = tree.get(s);
			}
		}

		int[] answer = new int[enroll.length];
		for (int i = 0; i < enroll.length; i++) {
			answer[i] = result.getOrDefault(enroll[i], 0);
		}

		return answer;
	}
}
