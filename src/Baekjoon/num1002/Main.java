package Baekjoon.num1002;

/*
	문제    : BOJ 터렛
    유형    : 수학
	난이도   : EASY (S4)
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/1002
    날짜    : 22.05.08(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
		}

	}

	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {

		int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		if (d > Math.pow(r1 + r2, 2) || d < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		if (d == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		if (d == Math.pow(r1 + r2, 2)) {
			return 1;
		}

		return 2;

	}

}
