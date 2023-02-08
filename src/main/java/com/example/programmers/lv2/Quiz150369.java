package com.example.programmers.lv2;

import java.util.ArrayList;

public class Quiz150369 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        ArrayList<Integer> deliveryCar = movingCar(cap, n, deliveries);
        ArrayList<Integer> pickupCar = movingCar(cap, n, pickups);

        int times = deliveryCar.size();

        int timesGap = deliveryCar.size() - pickupCar.size();

        if (timesGap > 0) {
            for(int i=0; i<timesGap; i++) {
                pickupCar.add(0);
            }
        } else {
            times = times - timesGap;
            for(int i=0; i<-timesGap; i++) {
                deliveryCar.add(0);
            }
        }

        for(int i=0; i<times; i++) {
            if(deliveryCar.get(i) >= pickupCar.get(i)) {
                answer += deliveryCar.get(i);
            } else {
                answer += pickupCar.get(i);
            }
        }

        for(int i=0; i<deliveryCar.size(); i++) {
            System.out.println(deliveryCar.get(i));
        }
        System.out.println("--");
        for(int i=0; i<pickupCar.size(); i++) {
            System.out.println(pickupCar.get(i));
        }

        answer = answer * 2;

        return answer;
    }

    public ArrayList<Integer> movingCar(int cap, int n, int[] deliveries) {
        ArrayList<Integer> car = new ArrayList<>();
        int carpool = 0;

        for(int index=n-1; index>=0; index--) {

            boolean isNewCar = carpool == 0; //
            boolean isTarget = deliveries[index] > 0; // 목적지 T, 필요없음 F

            if(!isTarget) {
                continue;
            } else if (isNewCar && isTarget) {
                car.add(index+1);
                carpool += deliveries[index];

                if(deliveries[index] == cap) {
                    carpool = 0;
                }
            } else if (carpool+deliveries[index] >= cap) {
                deliveries[index] -= cap - carpool;
                carpool = 0;
                index++;
            } else {
                carpool += deliveries[index];
            }
        }

        return car;
    }

}

// 1 0 3 1 2