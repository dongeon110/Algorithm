package com.example.programmers.lv2;

public class Test142085 {
    public static void main(String[] args) {
        int n1 = 7;
        int k1 = 3;
        int[] enemy1 = {4, 2, 4, 5, 3, 3, 1};
        int answer1 = 5;

        int n2 = 2;
        int k2 = 4;
        int[] enemy2 = {3, 3, 3, 3, 1};
        int answer2 = 5;

        Quiz142085 quiz142085 = new Quiz142085();

        int myAnswer = quiz142085.solution(n2, k2, enemy2);
        System.out.println((answer2 == myAnswer) + " : " + myAnswer);

    }

}
