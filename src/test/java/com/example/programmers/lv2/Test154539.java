package com.example.programmers.lv2;

public class Test154539 {

    public static void main(String[] args) {
        int[] numbers1 = {2, 3, 3, 5};
        int[] answers1 = {3, 5, 5, -1};
        int[] numbers2 = {9, 1, 5, 3, 6, 2};
        int[] answers2 = {-1, 5, 6, 6, -1, -1};

        Quiz154539 quiz154539 = new Quiz154539();
//        int[] myAnswer1 = quiz154539.solution(numbers1);
        int[] myAnswer2 = quiz154539.solution(numbers2);

//        boolean result1 = isThatTrue(myAnswer1, answers1);
        boolean result2 = isThatTrue(myAnswer2, answers2);

//        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }

    public static boolean isThatTrue(int[] myAnswer, int[] answer) {
        int myAnswerlength = myAnswer.length;
        int answerlength = answer.length;

        if (myAnswerlength != answerlength) return false;

        for (int index=0; index<answerlength; index++) {
            if (myAnswer[index] != answer[index]) {
                return false;
            }
        }

        return true;
    }
}
