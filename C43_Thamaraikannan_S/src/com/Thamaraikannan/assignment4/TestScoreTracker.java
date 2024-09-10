package com.Thamaraikannan.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] scoreStrings = scanner.nextLine().split(" ");

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(scoreStrings[i]);
        }

        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }

        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        scanner.close();
    }
}
