package com.example.programmers.lv2;

import java.util.ArrayList;

public class Quiz142085 {
    public int solution(int n, int k, int[] enemy) {
        if(k == enemy.length) {
            return k;
        }

        int answer = k;
        int sum = 0;

        Queue queue = new Queue();

        for(int i=0; i<k; i++) {
            queue.push(enemy[i]);
        }

        int index = k;

        while(sum <= n) {
            int last = queue.popPreview();

            if (index == enemy.length) {
                answer++;
                break;
            }

            if (enemy[index] > last) {
                queue.push(enemy[index]);
                queue.remove();
                sum += last;
            } else {
                sum += enemy[index];
            }
            index++;
            answer++;

        }
        answer -= 1;

        return answer;
    }

    public class Queue {
        ArrayList<Integer> queue;

        public Queue() {
            queue = new ArrayList<>();
        }

        public void push(int a) {
            boolean isBiggest = true;

            for(int index=0; index<queue.size(); index++) {
                if(a <= queue.get(index)) {
                    queue.add(index, a);
                    isBiggest = false;
                    break;
                }
            }

            if(isBiggest) {
                queue.add(a);
            }
        }

        public void remove() {
            queue.remove(queue.size() -1);
        }

        public int popPreview() {
            return queue.get(queue.size() -1);
        }
    }
}
