package com.example.programmers.lv2;

public class Test87377 {
    public static void main(String[] args) {

        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        Quiz87377 quiz87377 = new Quiz87377();
        String[] answer = quiz87377.solution(line);
        for (String ans : answer) System.out.println(ans);

    }
}
