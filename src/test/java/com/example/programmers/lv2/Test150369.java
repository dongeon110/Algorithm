package com.example.programmers.lv2;

public class Test150369 {
    public static void main(String[] args) {
        Quiz150369 quiz150369 = new Quiz150369();

//        int cap = 4;
//        int n = 5;
//        int[] deliveries = {1, 0, 3, 1, 2};
//        int[] pickups = {0, 3, 0, 4, 0};

        int cap = 2;
        int n = 7;
        int[] deliveries = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = {0, 2, 0, 1, 0, 2, 0};

        long answer = quiz150369.solution(cap, n, deliveries, pickups);

        System.out.println("Answer : " + answer);
    }
}
