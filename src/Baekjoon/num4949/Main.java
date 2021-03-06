package Baekjoon.num4949;

/*
	문제    : 균형잡힌 세상
    유형    :
	난이도  : Easy
	시간    :
	uri    : https://www.acmicpc.net/problem/4949
    날짜    : 22.01.15(o)
    refer :
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Stack<Character> stack = new Stack<>();
			String line = sc.nextLine();
			if (line.charAt(0) == '.') {
				break;
			}
			boolean isCorrect = true;
			for (char c : line.toCharArray()) {
				if (c == '(') {
					stack.push(')');
				} else if (c == '[') {
					stack.push(']');
				} else if (c == ')') {
					if (!stack.isEmpty()) {
						if (stack.pop() != ')') {
							System.out.println("no");
							isCorrect = false;
							break;
						}
					} else {
						System.out.println("no");
						isCorrect = false;
						break;
					}
				} else if (c == ']') {
					if (!stack.isEmpty()) {
						if (stack.pop() != ']') {
							System.out.println("no");
							isCorrect = false;
							break;
						}
					} else {
						System.out.println("no");
						isCorrect = false;
						break;
					}
				}
			}
			if (isCorrect) {
				if(stack.isEmpty()){
					System.out.println("yes");
				}else { // ex  (
					System.out.println("no");
				}
			}
		}
	}
}
