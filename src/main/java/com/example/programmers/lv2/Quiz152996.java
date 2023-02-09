package com.example.programmers.lv2;

public class Quiz152996 {
    public long solution(int[] weights) {
        long answer = 0;
        // [100,180,360,100,270]	4

        for(int index=0; index<weights.length; index++) {
            for(int idx=index+1; idx<weights.length; idx++) {
                if(isSeesaw(weights[idx], weights[index])) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public boolean isSeesaw(int a, int b) {
        int small;
        int big;

        if (a == b) {
            return true;
        } else if (a<b) {
            small = a;
            big = b;
        } else {
            small = b;
            big = a;
        }

        return (small*2 == big || small*3 == big*2 || small*4 == big*3);
    }
}
