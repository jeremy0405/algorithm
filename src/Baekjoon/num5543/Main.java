package Baekjoon.num5543;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];

        int min_burger, min_drink;

        for(int i = 0; i < 3; i++) burger[i] = sc.nextInt();

        for(int i = 0; i < 2; i++) drink[i] = sc.nextInt();

        Arrays.sort(burger);
        Arrays.sort(drink);

        System.out.println(burger[0]+drink[0]-50);

    }
}
