package com.example.programmers.lv2;

import lombok.Data;

@Data
public class Quiz154539 {

    /**
     * 82.6
     * @param numbers
     * @return
     */
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];

        for(int index=0; index<length-1; index++) {
            answer[index] = -1;
            for(int idx=index+1; idx<length; idx++) {
                if(numbers[idx] > numbers[index]) {
                    answer[index] = numbers[idx];
                    break;
                }
            }
        }

        answer[length-1] = -1;

        return answer;
    }

}
