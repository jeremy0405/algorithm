package Baekjoon.num11279;

/*
	문제    : BOJ 최대 힙
    유형    : 우선순위 큐
	난이도   : EASY(S2)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/11279
    날짜    : 22.04.09(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//최대힙
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				if (queue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(queue.poll());
				}
			} else {
				queue.offer(n);
			}
		}
	}
}
