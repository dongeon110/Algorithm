package com.example.programmers.lv2;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Quiz155651 {
    // 00:00~23:59
    // book_time <= 1000
    // [[start, end], [start, end]

    ArrayList<ArrayList<String>> book_time = new ArrayList<>();
    Integer roomCount = 0; // 남은 방 개수
    Integer maxRoomCount = 0; // 총 방 개수

    public void sonnim_in() {
        if (roomCount == 0) {
            roomCount += 1;
            maxRoomCount += 1;
        }
        roomCount -= 1;
    }

    public void sonnim_out() {
        roomCount += 1;
    }

    public LocalTime addCleanTime(LocalTime outTime) {
        outTime.plusMinutes(10);
        return outTime;
    }

//    public ArrayList<ArrayList<String>> separateTime(ArrayList<ArrayList<String>> book_time) {
//        ArrayList<String> inSonnim = new ArrayList<>();
//        ArrayList<String> outSonnim = new ArrayList<>();
//
//        for(ArrayList<String> sonnim: book_time) {
//            inSonnim.add(sonnim.get(0));
//
//            LocalTime outTime = LocalTime.parse(sonnim.get(1));
//            outTime.plusMinutes(10);
//
//            outSonnim.add(outTime.toString());
//        }
//
//        inSonnim.sort(Comparator.naturalOrder());
//        outSonnim.sort(Comparator.naturalOrder());
//    }

//    public Integer solution(ArrayList<ArrayList<LocalTime>> book_time) {
//
//        return answer;
//    }
}
